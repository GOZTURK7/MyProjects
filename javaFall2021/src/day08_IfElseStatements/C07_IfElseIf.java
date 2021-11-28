package day08_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Maas için bir teklif giriniz");
		int teklif = scan.nextInt();
		
		if (teklif < 0) {
			System.out.println("Lütfen geçerli bir teklif giriniz.:");
		} else if (teklif < 60000) {
			System.out.println("Maalesef kabul edemem");
		} else if (teklif < 80000) {
			System.out.println("Konuşabiliriz");
		} else {
			System.out.println("Kabul ediyorum");
		}
		scan.close();
	}

}
