package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Lütfen bir ay numarası giriniz:");
    	int num = scan.nextInt();
      	
    	
    	switch(num) {
    	case 1:
    		System.out.println("Ocak Ayı 31 gündür");
    		break;
    	case 2:
    		System.out.println("Şubat Ayı 28 gündür");
    		break;
    	case 3:
    		System.out.println("Mart Ayı 31 gündür");
    		break;
    	case 4:
    		System.out.println("Nisan Ayı 30 gündür");
    		break;
    	case 5:
    		System.out.println("Mayıs Ayı 31 gündür");
    		break;
    	case 6:
    		System.out.println("Haziran Ayı 30 gündür");
    		break;
    	case 7:
    		System.out.println("Temmuz Ayı 31 gündür");
    		break;
    	case 8:
    		System.out.println("Ağustos Ayı 31 gündür");
    		break;
    	case 9:
    		System.out.println("Eylül Ayı 30 gündür");
    		break;
    	case 10:
    		System.out.println("Ekim Ayı 31 gündür");
    		break;
    	case 11:
    		System.out.println("Kasım Ayı 30 gündür");
    		break;
    	case 12:
    		System.out.println("Aralık Ayı 31 gündür");
    		break;
    	default:
    		System.out.println("Lütfen geçerli bir ay girin.");

    	scan.close();
    	}
       
    }
}

