package RandomExercises;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
	
	/*
	 * Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini
	 * yazdirin ORNEK: INPUT : # OUTPUT : girdiginiz # karakterinin ascii degeri
	 * = 35'dir.
	 */
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Lütfen İsminizi Giriniz: ");
	char karakter = scan.next().charAt(0);
	int ascii = (int) karakter;
	System.out.print("Girdiğiniz kelimenin ilk harfinin ASCII değeri:" + ascii);

	scan.close();
	
	
	
	}
}