package RandomExercises;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		
		/*
		 * SORU 5
		 * 
		 * Kullaniciya gunde kac saat uyudugunu sorun, 
		 * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
		 * 
		 * Ornek : Input : 8 
		 *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
		 */
		
		Scanner scan = new Scanner(System.in);	
		System.out.print("Günde Kaç Saat Uyuyorsunuz: ");
		int x = scan.nextInt();
		System.out.println(
				"Ayda: " + ((x*30)/24) + 
				", Yılda: " + ((x*365)/24) + 
				", 40 yılda: " + ((x*365*40)/24));
		
		scan.close();
	}

}
