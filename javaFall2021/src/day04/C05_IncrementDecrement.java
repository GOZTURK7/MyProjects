package day04;

public class C05_IncrementDecrement {

	public static void main(String[] args) {

		// atama işlemi (assign) olursa sayının değeri kalıcı olarak değişiri.
		// atama yapılmadan sadece toplama çıkarma vb. yapılan işlemler sadece o satırda
		// yapılır sayının değerini kalıcı olarak değiştirmez.
		
		int sayi1 = 10;
		
		System.out.println(sayi1 += 5); // 15
		// bu işlem sayi1'in değerini 5 artırıp sayi1'e assign ediyor
		// dolayısıyla sayi1'in değer kalıcı olarak değişiyor.
		
		System.out.println(sayi1); // 15
		
		System.out.println(sayi1 + 12); // 27
		
		System.out.println(sayi1); // 15
		
		sayi1++; // her ne kadar = işareti görünmese de sayi1++ işleminde assign vardır.
		// o yüzden kalıcı olarak sayi1' i değiştirir.
		
		System.out.println(sayi1); // 16




	}

}
