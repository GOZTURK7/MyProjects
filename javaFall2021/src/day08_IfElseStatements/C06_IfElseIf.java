package day08_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 100 üzerinden notunuzu giriniz: ");
		int not = scan.nextInt();
		
		if (not < 0 || not > 100) {
			System.out.println("Lütfen geçerli bir sayı giriniz");
		} else if (not < 50) {
			System.out.println("Harf notunuz : D");
		} else if(not <60) {
			System.out.println("Harf notunuz : C");
		} else if(not < 80) {
			System.out.println("Harf notunuz : B");
		} else {
			System.out.println("Harf notunuz : A");
		}
		scan.close();
	}

}
