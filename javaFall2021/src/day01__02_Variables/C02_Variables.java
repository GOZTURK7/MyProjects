package day01__02_Variables;

public class C02_Variables {

	public static void main(String[] args) {
		
		String okul = "Yildiz koleji"; 
		
		// Aynı isim ve değişken türü ile ikinci defa Variable oluşturulamaz.
		// String okul = "Mehmet Koleji";
		
		
		// farklı data türü de ola aynı isim ile ikinci defa Variable oluşturulamaz
		// int okul = 20;
		
		
		// var olan bir variable'a yeni değer atayabiliriz.
		okul = "Mehmet Koleji";
		
		System.out.println(okul);	
		
		
		// Yazdırma işleminde açıklama eklemek isterek 
		// mesela okul adi : Mehmet Koleji yazdıralım.
		
		System.out.println("okul adi : "+ okul);
		System.out.println("okul adi : "+ "okul");

		
	}

}
 