package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi haftanin ilk gunu olarak aliniz..
        
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bugün pazartesi \nLütfen Kaç Gün sonrasını merak ediyorsanız o sayıyı girin:");
    	int gun = scan.nextInt();
    			
    	
    	switch(gun%7) {
    	case 0 :
    		System.out.println("Pazartesi");
    		break;
    	case 1 :
    		System.out.println("Salı");
    		break;
    	case 2 :
    		System.out.println("Çarşamba");
    		break;
    	case 3 :
    		System.out.println("Perşembe");
    		break;
    	case 4 :
    		System.out.println("Cuma");
    		break;
    	case 5 :
    		System.out.println("Cumartesi");
    		break;
    	case 6 :
    		System.out.println("Pazar");
    		break;
    	}
    	scan.close();
    	
    }
}

