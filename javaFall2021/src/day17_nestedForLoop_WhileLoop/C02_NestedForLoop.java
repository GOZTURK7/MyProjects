package day17_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
/*
 kullanıcıdan 10 dan küçük pozitif bir tamsayi girmesini isteyin
 girdi sayyı göre aşağıdaki şekli yazdırın
 
 orn: 3 girerse
 1
 1 2 
 1 2 3
		
	*/	
		

		Scanner scan = new Scanner(System.in);
		System.out.println("iki tam sayı giriniz:");
		
		int num = scan.nextInt();

		
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}System.out.println();
		}
		scan.close();
		
	}

}
