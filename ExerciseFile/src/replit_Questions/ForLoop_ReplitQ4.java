package replit_Questions;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoop_ReplitQ4 {

	public static void main(String[] args) {
		/*
		 * SORU4: Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi
		 * yazıniz. Input : 6 Output: 6!=65432*1=720
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayı girin");
		int num = scan.nextInt();

		int faktoriyel = 1;
		for (int i = 1; i <= num; i++) {
			faktoriyel *= i;
		}
		System.out.println(faktoriyel);

		scan.close();
	}

}
