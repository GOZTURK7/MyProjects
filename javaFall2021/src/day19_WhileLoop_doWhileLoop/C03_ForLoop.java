package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {

		
		
		/*
		 Kullanıcıdan bir sayı alın ve bu sayının
		 rakamları toplamını yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı girin:");
		int num = scan.nextInt();
		
		
		
		
		int rakamlarToplamı=0;
		int rakam=0;
		
		String numStr=""+num;
		
		for (int i=0; i<numStr.length(); i++ ) {
			rakam=num%10;
			rakamlarToplamı+=rakam;
			num/=10;
		}System.out.println("girdiğiniz sayının rakamlar toplamı: " + rakamlarToplamı);
		
		scan.close();
	}

}
