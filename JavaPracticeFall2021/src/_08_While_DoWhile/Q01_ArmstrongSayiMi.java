package _08_While_DoWhile;

import java.util.Scanner;

public class Q01_ArmstrongSayiMi {

	public static void main(String[] args) {
		// verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
		// Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
		// 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı girin.");

		int num = scan.nextInt();
		int numOrjinal = num;
		int basamakSayisi = String.valueOf(num).length();
		int uslerToplamı = 0;

		int us = basamakSayisi;
		for (int i = 0; i < basamakSayisi; i++) {
			int a = num % 10;
			num = num / 10;
			int usCarpım = 1;
			for (int j = 0; j < basamakSayisi; j++) {
				usCarpım = usCarpım * a;
			}
			uslerToplamı += usCarpım;

		}
		if (uslerToplamı == numOrjinal) {
			System.out.println(uslerToplamı + " = " + numOrjinal + " Armstrong sayı");
		}
		System.out.println(uslerToplamı);

	}

}
