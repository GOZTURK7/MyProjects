

    /*
    ============================================= VOLATILE ===============================================================
 Volatile (uçucu, geçici, kalıcı olmayan) keyword'u, Bir degiskenin farklı threadler tarafından kullanılırken degerinin
 degismesini saglamak icin kullanılmaktadir. Aynı zamanda bir class'ı thread-safe(thread güvenliği ile çalışma) yapmak
 icin de kullanılır.(tread safe EŞ ZAMANLILIĞI KORUMAK DEMEK)
  Yani eş zamanlı olarak volatile veriable threadler tarafından erişip güncelleyebilir ve Volatile keywordu sadece
  DEĞİŞKENLER ile (primitif veya non-primitif)
  kullanılabilir. !!!! Obj, method ve Class'lara konulmaz

 Volatile keywordu kullanılan bir veriable'ın degeri cache bellege saklanmaz. Her defasında ilgili class'ın process bellegi
 (MAIN MEMORY) den okunur. Dolayısıyla farklı thread'ler degiskeni guncellese de her defasında en guncel deger okunmus olur.
 Bu özellikleri sayesinde Synchronization yönteminin daha iyi bir alternatifi olarak düşünülebilir.

     */
public class MT05Volatile {

    volatile public static int yas = 0; // class level'da birden çok thread'in erişeceği ve update etmek istediği
                             // variable (sevdalanacak bir hatun)

    public static void main(String[] args) {

        Thread thTopcu1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(yas==0){ // yaş variable 0 olduğu sürece print çalış değilse döngüden çık/kır
                        System.out.println("Topcu1 şutu çekti : yas hala 0 büyümedi bu veled :");
                    }else
                        break;
                }
            }
        });

        Thread thTopcu2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                yas=01;
                System.out.println("topcu2 şutu çekti: veled nihayet yasına bastı :");
            }
        });

        thTopcu1.start();
        thTopcu2.start();
    }
}
