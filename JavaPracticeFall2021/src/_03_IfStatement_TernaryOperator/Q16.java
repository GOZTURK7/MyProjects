package _03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen 1. sayıyı giriniz: "); 
    	int num1 = scan.nextInt();
    	
    	System.out.println("Lütfen 2. sayıyı giriniz: "); 
    	int num2 = scan.nextInt();
    	
    	System.out.println("Lütfen 3. sayıyı giriniz: "); 
    	int num3 = scan.nextInt();
    	
    	if (num1 > num2 && num1 > num3) {
    		if (num2 > num3) {
    	    	System.out.println("En Büyük Sayı :" + num1 +" ve En Küçük Sayı :" + num3);
    		}else if (num3 > num2) {
    	    	System.out.println("En Büyük Sayı :" + num1 +" ve En Küçük Sayı :" + num2);
    		}else {
    	    	System.out.println("En Büyük Sayı :" + num1 + " sayı2=Sayı3 :" + num2);
    		}		
    	} else if (num2 > num1 && num2 > num3) {
    		if (num1 > num3) {
    	    	System.out.println("En Büyük Sayı :" + num2 +" ve En Küçük Sayı :" + num3);
    		}else if (num3 > num1) {
    	    	System.out.println("En Büyük Sayı :" + num2 +" ve En Küçük Sayı :" + num1);
    		}else {
    	    	System.out.println("En Büyük Sayı :" + num2 + " sayı1=Sayı3 :" + num1);
    		}
    	}else if (num3 > num1 && num3 > num2) {
    		if (num1 > num2) {
    	    	System.out.println("En Büyük Sayı :" + num3 +" ve En Küçük Sayı :" + num2);
    		}else if (num2 > num1) {
    	    	System.out.println("En Büyük Sayı :" + num3 +" ve En Küçük Sayı :" + num1);
    		}else {
    	    	System.out.println("En Büyük Sayı :" + num3 + " sayı2=Sayı3 :" + num1);
    		}
    	}else {
    		System.out.println("Tüm Sayılar birbirine eşit Sayı1 = Sayı2 = Sayı3 =" +num1);
    	}
    	scan.close();
    }
}

