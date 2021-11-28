package day13_stringManupulations;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {

		/*
		 Kullanıcıdan bir cümle ve bir kelime alın  
		 verilen cümlenin verilen kelime ile başlayıp 
		 başlamadığını ve bitip bitmediğini yazın.
		 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cumle = scan.nextLine();
		
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scan.nextLine();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile başlıyor");
		}else {
			System.out.println("girilen cumle " + kelime + " ile başlamıyor");
		}
		
		
		if (cumle.endsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile bitiyor");
		}else {
			System.out.println("girilen cumle " + kelime + " ile bitmiyor");
		}
		scan.close();

	}
	

}
