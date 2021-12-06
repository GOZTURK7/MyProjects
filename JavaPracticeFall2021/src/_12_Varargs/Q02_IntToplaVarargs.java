package _12_Varargs;

public class Q02_IntToplaVarargs {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
		
		
		
		
		topla(2,3,4,5,6,7);
		topla(2,34,56,67,64);
		
		

	}

	private static void topla(int carpilacakSayi, int...toplanacakSayilar) {
		
		int toplam = 0;

		for (int i : toplanacakSayilar) {
			
			toplam+=i;
		}
		System.out.println("sonuç: " + toplam*carpilacakSayi);
		
		

		
		
		
		
	}

}
