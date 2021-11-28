package day01__02_Variables;

public class C03_Variables {

	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;
		
		String sayi3 = "10";
		String sayi4 = "20"; 
		
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi2 + sayi3);
		System.out.println(sayi2+ " " + sayi3);
		
		
		//farklı data türler iaynı değeri alabilir
		// burada önemli olan bu değişkenleri değişken türüne göre işlem yapabileceğimdir.
		String harf1 = "A";
		char harf2 = 'A';

		// Yukarıdaki değişkenleri kullanarak 30A yazdırın.
		System.out.println(sayi1 + sayi2 + harf1);
		// char estra özelliği sebebiyle matematiksel işelmlerde numerik deger alır.
		System.out.println(sayi1 + sayi2 + harf2);
		// eğer toplanan ifadelerden bir tanesi bile string ise bunları yan yana yazar ve
		//strink hale getirir aşağıdakinin çıktısı  A1020 yazar
		System.out.println(harf1 + sayi1 + sayi2);
		
		System.out.println(sayi1 + harf1 + sayi2); // 10A20
		
		System.out.println(harf1 +(sayi1 + sayi2)); //A30
		
		System.out.println(sayi1 + sayi2 + harf1); // 30A




		
		
		
		
		
	}

}
