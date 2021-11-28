package _08_While_DoWhile;

import java.util.Scanner;

public class Q07_BittiDiyeneKadarÇalışanProgram {

	public static void main(String[] args) {
		// Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
		// ve x girildiğinde ise "Program bitti" yazan programı yazınız.

		Scanner scan = new Scanner(System.in);

		String str = "";

		do {

			str = scan.next();

			System.out.println("Program Çalışıyor");

		} while (!str.equalsIgnoreCase("x"));

	}
}
