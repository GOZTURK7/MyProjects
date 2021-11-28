package day03_SwapVariable_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {

		// 2- Verilen sayi1 ve sayi2 variable'larının değerlerinin üçüncü bir
		// variable olmadan (SWAP) BİR PROGRAM YAZINIZ.
		
		int sayi1 = 15;
		int sayi2 = 20;
		
		// başlangıçta sayi1 = 10 ve sayi2 = 20 yazdıralım
		System.out.println("başlangıçta sayi1= " + sayi1 + " ve sayi2= " + sayi2);
		
		
		// üçüncü bir variable kullanmayacaksak, verilen iki sayının farkından istifade ediyoruz.
		
		// ilk adım olarak sayıların farkını ilk sayıya assign ediyoruz.
		
		sayi1 = sayi1 - sayi2;
		
		// ikinci adım fark ile sayi2'yi toplayıp sayi2'ye assign ediyorum.
		sayi2 = sayi1 + sayi2;
		
		// üçüncü adım olarak sayi1' sayi2 - fark atıyorum.
		sayi1 = sayi2 - sayi1;
		
		System.out.println("sonuçta sayi1= " + sayi1 + " ve sayi2= " + sayi2);

		
		
		
	}

}
