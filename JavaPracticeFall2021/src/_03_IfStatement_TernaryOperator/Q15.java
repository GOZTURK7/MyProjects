package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int sayi = scan.nextInt();
		
		int mutlak = Math.abs(sayi);
		
		System.out.println(mutlak);
		
		
		//--------------------------------------------
		
		System.out.println("Lütfen bir sayı giriniz:");
		int sayi1 = scan.nextInt();
		
		int mutlak1 = sayi1*(-1);
		
		if (sayi1 >= 0) {
			System.out.println("Sayı Pozitif: " + sayi1);
		} else {
			System.out.println("Sayı Negatif: " + sayi1 + " Mutlak Değeri: "+ mutlak1);
		}
		
		scan.close();
		
		
		
		
		
		
		
	}

}
