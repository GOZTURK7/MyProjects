package day17_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop_HomeWork {

	public static void main(String[] args) {

		/*
		 * Kullanıcıdan toplanmak üzere sayılar isteyin, sayı adedi 10'u geçerse veya
		 * toplam 500'ü geçerse " bu kadar sayı yeter " .... adet sayı girdin,
		 * toplamı....." yazdırın
		 */

		Scanner scan = new Scanner(System.in);

		int toplam = 0;
		int sayac = 0;

		while (toplam < 500 && sayac < 10) {
			System.out.println("Lütfen toplamak için sayı giriniz");
			int num = scan.nextInt();
			toplam += num;
			sayac++;
		}
		if (toplam > 500 && sayac < 10) {
			System.out.println("Toplam 500'ü aştı Toplam: " + toplam + 
					"\nSayac: " + sayac);
		} else if (toplam < 500 && sayac >= 10) {
			System.out.println("Toplam: " + toplam + 
					"\nBu kadar sayı yeter, Sayac: " + sayac);
		} else {
			System.out.println("Toplam 500'ü aştı Toplam: " + toplam + 
					"\nve Sayıda aştı Sayac: " + sayac);

		}

	}

}
