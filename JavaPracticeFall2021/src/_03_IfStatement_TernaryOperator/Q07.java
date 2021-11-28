package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz:");
		char karakter = scan.next().charAt(0);
		
		String result = ((karakter >='A' && karakter <= 'Z') || (karakter >= 'a' && karakter <='z')) ? 
				((karakter >='A' && karakter <= 'Z') ? ("Büyük Harf") : ("Küçük Harf")) : ("Hatalı Giriş");
		
		System.out.println(result);
		
		scan.close();

	}

}
