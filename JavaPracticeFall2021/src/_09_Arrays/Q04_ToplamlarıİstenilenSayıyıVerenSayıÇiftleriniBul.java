package _09_Arrays;

import java.util.Scanner;

public class Q04_ToplamlarıİstenilenSayıyıVerenSayıÇiftleriniBul {

	public static void main(String[] args) {
		/*
		 * verilen bir int Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
		 * istenenToplam=9;
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı girin");
		int num = scan.nextInt();
		int[] arr = { 5, 7, -6, 4, 2, 15, 3, 8, 1 };

		toplamlarıEsitMi(num, arr);

		scan.close();
	}

	private static void toplamlarıEsitMi(int num, int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) { //sorunun tricki
				if (arr[i] + arr[j] == num) {
					System.out.println("istediğiniz sayıyı veren sayı çiftleri: " + arr[i] + " ve " + arr[j]);
				}
			}

		}
	}
}
