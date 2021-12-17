package java_Oca_Interview_Questions;

import java.util.Scanner;

public class AsalMı {

	public static void main(String[] args) {


		/*
		Ask user enter a positive number and check if it is prime or not

		Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz (pozitif)");
		int num = scan.nextInt();
		
		boolean flag=true;
		for (int i = 2; i < num; i++) {
			
			if (num%i==0) {
				flag=false;
				break;
				
			}
			
		}if (flag) System.out.println(num + " bir asal sayıdır.");
			
		else System.out.println(num + " bir asal sayı değildir.");

		
		
		
		
	}

}
