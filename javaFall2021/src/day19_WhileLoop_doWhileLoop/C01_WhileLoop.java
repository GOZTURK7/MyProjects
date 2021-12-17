package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
/*
 Kullanıcıdan bir sayı alın ve bu sayıyı tam bölen sayıları
 ve toplam kaç tane olduklarını ekranda yazdırın
 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir say girin:");
		int num = scan.nextInt();
		
		
//		int factor = 0;
//		String factors ="";
//		
//		for (int i = 1; i <= num; i++) {
//			if(num%i==0) {
//				factor+=1;
//				factors+=(i+" ");
//			}
//			
//			
//		}System.out.println(factor);
//		System.out.println(factors);
		
		
		int sayac=0;
		int bolen=1;
		
		while(bolen<=num) {
			
			if (num%bolen==0) {
				System.out.println(bolen + " ");
				sayac++;
			}
			
			bolen++;
		}System.out.print(num + " sayısının " + sayac + " adet tam böleni vardır.");
//		
		scan.close();
	}

}
