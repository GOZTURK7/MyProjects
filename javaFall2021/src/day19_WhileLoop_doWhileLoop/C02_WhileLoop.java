package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {


		/*
		 Kullanıcıdan bir sayı alın ve bu sayının
		 rakamları toplamını yazdırın.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı girin:");
		int num = scan.nextInt();
		
	
		
		
		int rakamlarToplami=0;
		int rakam=0;
		
		while(num>0) {
			rakam = num%10;
			rakamlarToplami+=rakam;
			num/=10;
			
		}
		System.out.println("girdiğiniz sayının rakamlar toplamı: " + rakamlarToplami);
		
		scan.close();
		///////////// FOR LOOP İLE ///////////////
	
		
		
		
	}
	

}
