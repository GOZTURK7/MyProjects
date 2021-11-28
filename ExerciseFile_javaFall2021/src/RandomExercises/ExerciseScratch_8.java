package RandomExercises;

import java.util.Scanner;

public class ExerciseScratch_8 {

	public static void main(String[] args) {

		/*
		 * SORU 2
		 * 
		 * Kullanicidan 3 basamakli bir sayi alip sayinin okunusunu yazdirin
		 * 
		 * Input : 356 Output : Ucyuzellialti
		 * 
		 *
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Üç basamaklı bir sayı girin");
		int sayi = scan.nextInt();
		
		int yüzlerBasamagı = (sayi / 100);
		int onlarBasamagı = (sayi % 100)/10;
		int bırlerBasamagı =(sayi % 10);
		if (sayi >=100 && sayi <=999) {
			
		
			if (yüzlerBasamagı == 1 ) {
				System.out.print("yüz");
			}else if(yüzlerBasamagı == 2) {
				System.out.print("ikiyüz");

			}else if(yüzlerBasamagı == 3) {
				System.out.print("üçyüz");

			}else if(yüzlerBasamagı == 4) {
				System.out.print("dörtyüz");

			}else if(yüzlerBasamagı == 5) {
				System.out.print("beşyüz");

			}else if(yüzlerBasamagı == 6) {
				System.out.print("altıyüz");

			}else if(yüzlerBasamagı == 7) {
				System.out.print("yediyüz");

			}else if(yüzlerBasamagı == 8) {
				System.out.print("sekizyüz");

			}else if(yüzlerBasamagı == 9) {
				System.out.print("dokuzyüz");		
			}
			
			if(onlarBasamagı == 1) {
				System.out.print("on");		
			}else if(onlarBasamagı == 2) {
				System.out.print("yirmi");		
			}else if(onlarBasamagı == 3) {
				System.out.print("otuz");		
			}else if(onlarBasamagı == 4) {
				System.out.print("kırk");		
			}else if(onlarBasamagı == 5) {
				System.out.print("elli");		
			}else if(onlarBasamagı == 6) {
				System.out.print("altmış");		
			}else if(onlarBasamagı == 7) {
				System.out.print("yetmiş");		
			}else if(onlarBasamagı == 8) {
				System.out.print("seksen");		
			}else if(onlarBasamagı == 9) {
				System.out.print("doksan");		
			}
		
			if(bırlerBasamagı == 1) {
				System.out.print("bir");		
			}else if(bırlerBasamagı == 2) {
				System.out.print("iki");		
			}else if(bırlerBasamagı == 3) {
				System.out.print("üç");		
			}else if(bırlerBasamagı == 4) {
				System.out.print("dört");		
			}else if(bırlerBasamagı == 5) {
				System.out.print("beş");		
			}else if(bırlerBasamagı == 6) {
				System.out.print("altı");		
			}else if(bırlerBasamagı == 7) {
				System.out.print("yedi");		
			}else if(bırlerBasamagı == 8) {
				System.out.print("sekiz");		
			}else if(bırlerBasamagı == 9) {
				System.out.print("dokuz");		
			}
			
		}else {
			System.out.println("Lütfen üç basamaklı bir sayı giriniz");
		}
		scan.close();
				
	}

}
