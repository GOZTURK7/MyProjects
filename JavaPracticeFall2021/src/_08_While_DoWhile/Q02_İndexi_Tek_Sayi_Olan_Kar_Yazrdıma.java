package _08_While_DoWhile;

import java.util.Scanner;

public class Q02_İndexi_Tek_Sayi_Olan_Kar_Yazrdıma {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir string giriniz.");
		String str=scan.nextLine();
		
		
		int idx=0;
		do {
			if(idx%2==1) {
				System.out.print(str.charAt(idx));
			}			
			idx++;
		}while(idx!=str.length());

		scan.close();
		
	}

}
