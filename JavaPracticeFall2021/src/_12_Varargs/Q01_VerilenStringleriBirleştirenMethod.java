package _12_Varargs;

import java.util.Scanner;

public class Q01_VerilenStringleriBirleştirenMethod {

	static String harfler = "";

	public static void main(String[] args) {
		// verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

		System.out.println(concat());

	}

	private static String concat() {
		System.out.println("Lütfen harf girin ve enter'a basın");
		String harf = "";
		do {

			Scanner scan = new Scanner(System.in);

			harf = scan.next();

			if (!harf.equals("exit"))

				harfler += harf;

		} while (!harf.equals("exit"));

		return harfler;

	}

}
