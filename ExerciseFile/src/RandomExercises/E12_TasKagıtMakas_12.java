package RandomExercises;

import java.util.Random;
import java.util.Scanner;

public class E12_TasKagıtMakas_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		
		System.out.println("Lütfen; \nTaş için; 1, \nKağıt için;2 \nMakas için:3 rakamlarından birini seçiniz.");
		int oyuncu = scan.nextInt();
		int makina = random.nextInt(2);
		makina++;

		
		if (oyuncu >= 1 && oyuncu <=3) {
			System.out.println("Oyuncu: "+oyuncu+", \nMakina: "+ makina);
			if ((oyuncu == 1 && makina == 3) 
					|| (oyuncu == 2 && makina == 1) 
					|| (oyuncu == 3 && makina == 2)) {
				System.out.println("Oyuncu Kazandı.");
			}else if ((makina == 1 && oyuncu == 3) 
					|| (makina == 2 && oyuncu == 1) 
					|| (makina == 3 && oyuncu == 2)) {
				System.out.println("Makina Kazandı.");
			}else {
				System.out.println("Berabere");
			}
			
		}else{
			System.out.println("Lütfen 1 ile 3 arasında bir rakam seçin");
		}
		
		scan.close();
		

	}

}
