package day15_methodCreation;

public class C02_MethodOverloading {

	public static void main(String[] args) {

		
		
		/*
		 Javada aynı isimde birden fazla method olur mu?
		 cevap : evet
		 
		 Aynı isimde birden fazla method olursa java hangisini
		 çalıştıracağını nasıl anlar?
		 cevap : isim aynı olan methodlarda 
		 	1) öncelikle parametre sayısına bakar,
		 	2) parametre sayısı ile arguman sayısı eşit olanlardan
		 		arguman data türleri ile parametre data türleri arasında
		 		uyuma bakar tamamen uyuşan varsa onu kullanır.
		 		tamamen uyuşan yoksa kapsayan var mı diye bakar ve onu kullanır
		 		birden fazla seçenek olduğunda java her zaman en optimum olanı tercih
		 		eder.
		 		
		 */
		
		topla(2, 4);
		
	}	
	public static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("dört sayını toplamı " + (sayi1 + sayi2 + sayi3 + sayi4));
	
	}

	public static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("üç sayını toplamı " + (sayi1 + sayi2 + sayi3));
	
	}

	public static void topla(int sayi1, int sayi2) {
		System.out.println("iki sayını toplamı ii" + (sayi1 + sayi2));
	}
	public static void topla(int sayi1, double sayi2) {
		System.out.println("iki sayını toplamı id" + (sayi1 + sayi2));
	}
	public static void topla(double sayi1, int sayi2) {
		System.out.println("iki sayını toplamı di" + (sayi1 + sayi2));
	}
	public static void topla(double sayi1, double sayi2) {
		System.out.println("iki sayını toplamı dd" + (sayi1 + sayi2));
	}

}
