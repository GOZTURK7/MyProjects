package RandomExercises;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		/*
		 * Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun. 
		 * Bir yilda kac kg seker kullandigini hesaplayip yazdirin 
		 * 
		 * 1 seker = 1.7 gr
		 * 
		 * 
		 * Ornek : Input : cay sayisi : 10 seker sayisi :2 
		 *         Output : Yilda 12.41 kg seker kullaniyorsunuz
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Günde kaç çay içiyorsunuz: ");
		int cay = scan.nextInt();
		
		System.out.print("Kaç şeker kullanıyorsunuz: ");
		int seker = scan.nextInt();
		
		System.out.println("Çay sayısı: " + cay + ", Şeker sayısı: " + seker);
		
		double toplam = seker * 1.7;
		double yılda = toplam * 365;
		System.out.println(toplam);
		System.out.print("Yılda " + (yılda/1000) + "kg şeker kullanıyorsunuz.");
		
		scan.close();
		

	
		
		
		
	}

}
