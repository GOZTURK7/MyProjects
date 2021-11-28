package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {

		/*
		 * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
		 * döngüden çıkılsın
		 * 
		 * Bugün hava oldukca güzel.-> 2
		 * 
		 * 
		 */

		int counter = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir string girin:");
		String str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {

			if (str.substring(i, i + 1).equals("a")) {
				counter++;

			}else if (str.substring(i, i + 1).equals("c")) {
					System.out.println("c'ye denk geldi döngüden çıkıldı.");
					break;
				}


		}System.out.println("Stringdeki 'a' sayısı: " + counter);
		
		scan.close();
	}

}
