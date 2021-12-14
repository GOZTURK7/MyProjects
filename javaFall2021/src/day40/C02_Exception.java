package day40;

import java.util.Scanner;
import java.util.InputMismatchException;

public class C02_Exception {

	public static void main(String[] args) {

		// Kullanıcıdan istediği kadar sayı alıp
		// bu sayıları toplayan bir program yapınız.
		// sayı girişini bitirmek için q'ya basınız

		int sayi = 0;
		int toplam = 0;
		int count = 0;
		String secim = "";
		Scanner scan = new Scanner(System.in);

		try {
			while (count < 10000) {

				System.out.println("Lütfen toplamak için bir sayı yazınız: \nBitirmek için q'ya basınız");
				sayi = scan.nextInt();
				toplam += sayi;
				count++;

			}
		} catch (InputMismatchException e) {
			System.out.println("girdiğiniz "+count + " adet sayının toplamı: "+ toplam);
		}


	}

}
