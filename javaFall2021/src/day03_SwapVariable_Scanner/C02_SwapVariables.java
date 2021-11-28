package day03_SwapVariable_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {

	/* 1- Verilen sayi1 ve sayi2 variable'larının değerlerini değiştirenn (SWAP) bir program yazınız
	 * Örn : sayi1 = 10 ve sayi2 = 20;
	 * kod çalıştıktan sonra 
	 * sayi1 = 20 ve sayi2 = 10	
	 */
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		// başlangıçta sayi1 = 10 ve sayi2 = 20 yazdıralım
		System.out.println("başlangıçta sayi1= " + sayi1 + " ve sayi2= " + sayi2);
		
		
		// ilk önce boş bir variable oluşturalım.
		int bos; 
		
		// sayi2' yi boş variable'a atayalım.
		bos = sayi2;
		
		// sayi2 variable'ına sayi1 değerini atayalım.
		sayi2 = sayi1;
		
		// bos variable'daki değeri sayi1'e atayalım.
		sayi1 = bos;
		
		System.out.println("sonuçta sayi1= " + sayi1 + " ve sayi2= " + sayi2);

		
		
	}

}
