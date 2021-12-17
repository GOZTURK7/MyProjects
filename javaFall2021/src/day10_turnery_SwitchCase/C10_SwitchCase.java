package day10_turnery_SwitchCase;

public class C10_SwitchCase {

	public static void main(String[] args) {
		/*Soru3 : Kullanicidan bir sayi girmesini isteyin
		 Girilen sayi
		 10 ise “Iki basamakli en kucuk sayi 
		 100 ise “uc basamakli en kucuk sayi”
		 1000 ise “dort basamakli en kucuk sayi”
		 diger durumlarda “Girdigin sayiyi degistir” yazdirin
		 */
		
		int sayi = 10000;
		
		switch(sayi) {
		
		case 10:
			System.out.println("iki basamaklı en küçük sayı");
			break;
		case 100:
			System.out.println("üç basamaklı en küçük sayı");
			break;
		case 1000:
			System.out.println("dört basamaklı en küçük sayı");
			break;
		default:
			System.out.println("Girdiğiniz sayıyı değiştirin");

			
		
		}

	}

}
