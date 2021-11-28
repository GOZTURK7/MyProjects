package day05_Matematikselİşlemler;

public class C01_Matetamekselİxlemler {

	public static void main(String[] args) {

		System.out.println(4*(2+5)/2); // 14
		
		System.out.println(4*(2+5)/3); // sonuç 9,333333 Burada işlem yapılan tüm sayılar integer olduğu için 
										//sonucu 9 yazar.

		double sonuc = 4*(2+5)/3; // OUTPUT: 9.0 
		
		System.out.println(sonuc);
		
		sonuc = (double) 4*(2+5)/3; 
		
		System.out.println(sonuc);
		
		
		int sayi1 = 5;
		int sayi2 = 2;
		double sayi3 = 2;
		
		System.out.println(sayi1/sayi2); // 2
		System.out.println(sayi1/sayi3); // 2.5  küçük data veri tipi işleme girdiği büyük data veri tipinde sonuç döner.
										// burada sayi3 double ve sayi1 integer olduğundan sonuç double olarak virgüllü çıkıyor.
		
		



	}

}
