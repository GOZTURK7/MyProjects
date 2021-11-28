package day08_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		//Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
		//sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
		//sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, 
		//sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen birinci sayıyı girin: ");
		int sayi1 = scan.nextInt();
		
		System.out.println("Lütfen ikinci sayıyı girin: ");
		int sayi2 = scan.nextInt();
		
		
		if (sayi1 > 0 && sayi2 > 0) {
			System.out.println("sayıların toplamı : " + (sayi1 + sayi2));
		} else if (sayi1 < 0 && sayi2 < 0){
			System.out.println("sayıların çarpımı : " + (sayi1 * sayi2));
		} else if (sayi1*sayi2 < 0) { // çarpımları sıfırdan küçükse biri negatiftir.
			System.out.println("Farklı işaretlerde sayılarla işlem yapamazsınızı.");
		} else {
			System.out.println("sıfır çarpmaya göre yutan elemanır");
		}
		scan.close();
	}

}
