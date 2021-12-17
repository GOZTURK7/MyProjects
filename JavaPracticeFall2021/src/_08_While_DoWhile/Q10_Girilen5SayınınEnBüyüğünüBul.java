package _08_While_DoWhile;

import java.util.Scanner;

public class Q10_Girilen5SayınınEnBüyüğünüBul {

    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen beş sayı giriniz.");
		
    	int sonSayi=0;
    	int i=1;
    	while(i<=5) {
    		System.out.print(i+ ". sayı:");
    		int num = scan.nextInt();
    		if (num>sonSayi) {
    			sonSayi=num;
    		}  		
    		i++;
    	}System.out.println("girdiğiniz sayıların en büyüğü: " + sonSayi);
    	
    }
}


