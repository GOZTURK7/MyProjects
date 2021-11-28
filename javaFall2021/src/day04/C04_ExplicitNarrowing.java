package day04;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		// Eğer büyük data türündeki bir veriyi daha küçük data türündeki variable'a atamak istersek
		// Java bunu otomatik olarak yapmaz.
		
		int sayi1 = 300;
		
		short sayi2 = (short) sayi1;
		// eşitliğin sağı ile solundaki veri türleri farklı olduğundan java mismatch hatası veriyor.
		// hatayı gidermek için büyük data türündeki değer'in önüne manuel onayimizi gösteren 
		// (short) yazılır.

		
		System.out.println("sayi2 : " + sayi2);
		
		
		
		byte sayi3 = (byte) sayi2;
		
		System.out.println("sayi3 : " + sayi3);
		// değer byte'ın sınırlarından büyük olduğu için java int 300'ü kendi yöntemine göre 
		//byte'a dönüştürürür ve bu arada bizim sayımız DEĞİŞİR

		
		double sayi4 = 87.3;
		
		int sayi5 = (int) sayi4;
		
		System.out.println("sayi5 : " + sayi5);

		// değer virgüllü olduğundan ve int'da onalıklı kısım olmadığından java onalıklı kısmı keser
		// dolayısıyla data kaybı oluşur.
		
		int sayi6=27;
		int sayi7=4;
		
		System.out.println(sayi6 / sayi7); //bölme işlemi yapılan iki sayı da int olduğu için java sonucu int olarak yazar

	
		
		
		double sayi8 = 4;
		double sayi9 = 17; 
		System.out.println(sayi6 / sayi8); // 6,75 işlem yapılan sayılardan daha geniş data türüne sahip olan double olduğundan sonucu double olarak yazdırır
		
		
		System.out.println(sayi9 / sayi7); // 4.25
		
		
	}

}
