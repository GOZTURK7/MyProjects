package day03_SwapVariable_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {

		// Kullanıcıdan değer almak için üç adım takip edilir
		//1. Scanner objesi oluşturmak
		Scanner scan = new Scanner(System.in);
		
		//2. kullanıcıya ne istediğinizi söylemek.
		System.out.println("lütfen isminizi yazınız: ");
		
		String isim = scan.next();
		
		System.out.println("İsminiz: "+ isim);

		
		
		// scan bir scanner objesidir
		// isim olarak farklı bir isim yazsak da çalışır ama biz scan demeyi tercih ederiz.
		// scan bir obje olduğu için data türü non-primitive'dir
		// primitive data türleri sadece değer içerirken
		// non-primitive data türleri değerin yanında bir de method'lar barındırır.
		// scan. dediğimizde kullanabileceğimiz bu method'ları görebiliriz.
		

		
	}

}
