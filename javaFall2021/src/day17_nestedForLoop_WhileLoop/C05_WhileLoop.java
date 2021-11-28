package day17_nestedForLoop_WhileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {

		/*
		 * for loop ve while loop kullanarak
		 *  3 basamklı sayılardan 15, 20 ve 90'a
		 * bölünebilen sayıları yazdırın
		 */

		for (int i = 100; i < 1000; i++) {
			if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
				System.out.print(i);
			}
		}
		
		
		
		
		int sayi = 100; // başlangıç değerim
		
		while(sayi < 1000) {
			if (sayi % 15 == 0 && sayi % 20 == 0 && sayi % 90 == 0) {

			System.out.println(sayi);
			}
			sayi++;
		}
		
		/*
		 eğer başlangıç ve bitiş şartı bir sayının artışına bağlı ise 
		 veya tekrar edilecek işlem adedi belliyse for loop tercih edilir
		 
		 
		 işlem tekrar sayısı belli değilse veya bitiş için bir sınır 
		 değerinden büyük olmab gibi bir şart varsa while loop tercih edilir
		 */
	}

}
