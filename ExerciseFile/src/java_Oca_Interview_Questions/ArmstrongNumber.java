package java_Oca_Interview_Questions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		/*
		 * Check if the integer is an Armstrong numbers Armstrong sayi:herhangi bir
		 * sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi Armstrong
		 * sayidir ​ 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153 370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");

		String numStr = scan.next();
		int num = Integer.parseInt(numStr);

		System.out.println(arms(num, numStr));

		if (num == arms(num, numStr)) {
			System.out.println(num + " bir armstrong sayıdır.");
		} else {
			System.out.println(num + " bir armstrong sayı değildir.");
		}

	}

	private static int arms(int num, String numStr) {

		if (num / 10 == 0) {
			return num * num * num; // num num num :))
		} else {
			int a = num % 10;
			int carpım = 1;
			for (int i = 0; i < numStr.length(); i++) {
				carpım *= a;
			}
			return carpım + arms(num / 10, numStr);
		}
	}

}
