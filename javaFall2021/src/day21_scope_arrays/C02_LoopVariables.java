package day21_scope_arrays;

public class C02_LoopVariables {

	public static void main(String[] args) {

		int sayi=10;
		
		for (int i = 0; i < 30; i++) {
			String isim="Ali";
			System.out.println(sayi + " " + isim);
		}
		
		
		 //System.out.println(isim); 
		 //System.out.println(i);
		 /*
		  * loop içerisinde oluşturulan variable'lar loop dışarısında kullanılamazlar bunun için
		  * loop dışında da kullanacağımız bir değişkene ihtiyacımız varsa loop'dan önce oluşturur
		  * ve emniyette kalmak için initialize (yani ilk değer atamasını) yaparız.
		  */
		
		
		for (int i = 0; i < 10; i++) {
			//int sayi =10; 
			/* 
			sayi variable'ı main method içinde oluşturulduğundan tüm main method'da geçerlidir, dolayısıyla
			yeniden aynı isimde bir variable oluşturamazsınız.		
			*/
			
			
			@SuppressWarnings("unused")
			String isim="Ali";
			/*
			 * 
			 */
		}
		
		
	}

}
