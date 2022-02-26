public class MT02MethodLevelSynchronization {

   /* =========================================   SYNCHRONIZED  ==========================================================
    multi-threading çalışma koşullarında birden fazla thread'in aynı kaynağa (değişken metot, class, bellek vb)(Habil-Kabil kavgası )
    erişimi (okuma veya yazma) sırasında verinin güncellenmesi ve tutarlılığı ile ilgili sorunlar çıkabilir.
    Bu tutarsızlığı engellemek için synchronized keywordu kullanılabilir.
    Kısaca, Syncronization bir kaynağın tread'ler tarafından eş zamanlı kullanımına kapatılması (Lock) işlemidir.
    Synchronized keywordunun farklı kullanımları bulunmaktadır.
 1- Eğer bir metot "synchronized" yapılırsa (Method-Level Syncronization) bu metota aynı andan birden fazla thread'in
    erişimine izin verilmez.
 2- Eğer bir metot yerine o metodun ait olduğu class'ı aynı anda birden fazla thread'in kullanımına kapatmak
            (class-level Synchronization) istersek o zaman "synchronized static" kullanmalıyız.
 3- Eğer bir metot içerisinde belirli bir kismin eş zamanlı thread kullanımına kapatılmasını istenire
    "synchronized block" (block-level Synchronization) kullanılmalı.

    */
   public static int sayac=0; // kavga edilecek ortak erişim sorunu olacak threadlerin erişeceği variable creat edildi.

   public static void main(String[] args) {

      Sayici sayici = new Sayici();

      Thread thHabil = new Thread(new Runnable() {
         @Override
         public void run() {
            sayici.say("habil"); //eş zamanlı olamaz
            // falan class'da filan method çalış // eş zamanlı olabilir.

         }
      });

      Thread thKabil = new Thread(new Runnable() {
         @Override
         public void run() {
            sayici.say("kabil"); // eş zamanlı olamaz
            // falan class'da filan method çalış // eş zamanlı olabilir.
         }
      });


      thHabil.start();
//      thHabil.join(); // join() method multi-thread'i tamamen kısıtlar (öldürür) join() kullanılması thKabil ve thHabil
//      thread'ler eş zamanlı sayaç variable üzerinde action yapardı. Bu durumu engellemek için join() bir yöntem olsa da riski vardır join() ile
//      SYNCHRONIZED kullanımı ii planlamalı ...
      thKabil.start();
   }
}

class Sayici {

   public synchronized void say(String thread){ // synchronized  keyword --> bu methodun thread'ler tarafından eş zamanlı run edilmesini kısıtlar.
      for (int i = 0; i < 20; i++) {
         MT02MethodLevelSynchronization.sayac++;
         System.out.println("sayac-"+ thread+  ":"+MT02MethodLevelSynchronization.sayac);
      }
   }
}
