package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

    	Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Üç basamaklı bir sayı girin");
		int sayi = scan.nextInt();
		
		int yüzlerBasamagı = (sayi / 100);
		int onlarBasamagı = (sayi % 100)/10;
		int bırlerBasamagı =(sayi % 10);			
		
		if (sayi >=100 && sayi <=999) {
			switch (yüzlerBasamagı) {
			case 1:
				System.out.print("yüz");
				break;
			case 2:
				System.out.print("ikiyüz");
				break;
			case 3:
				System.out.print("üçyüz");
				break;
			case 4:					
				System.out.print("dörtyüz");
				break;
			case 5:
				System.out.print("beşyüz");
				break;
			case 6:
				System.out.print("altıyüz");
				break;
			case 7:
				System.out.print("yediyüz");
				break;
			case 8:
				System.out.print("sekizyüz");
				break;
			case 9:
				System.out.print("dokuzyüz");
				break;
			}
			
			switch (onlarBasamagı) {
			case 1:
				System.out.print("on");
				break;
			case 2:
				System.out.print("yirmi");
				break;
			case 3:
				System.out.print("otuz");
				break;
			case 4:
				System.out.print("kırk");
				break;
			case 5:
				System.out.print("elli");
				break;
			case 6:
				System.out.print("altımş");
				break;
			case 7:
				System.out.print("yetmiş");
				break;
			case 8:
				System.out.print("seksen");
				break;
			case 9:
				System.out.print("doksan");
				break;
			}
			
			switch (bırlerBasamagı) {
			case 1:
				System.out.print("bir");
				break;
			case 2:
				System.out.print("iki");
				break;
			case 3:
				System.out.print("üç");
				break;
			case 4:
				System.out.print("dört");
				break;
			case 5:
				System.out.print("beş");
				break;
			case 6:
				System.out.print("altı");
				break;
			case 7:
				System.out.print("yedi");
				break;
			case 8:
				System.out.print("sekiz");
				break;
			case 9:
				System.out.print("dokuz");
				break;
			}
				
			
		}else {
				System.out.println("Lütfen üç basamaklı bir sayı giriniz");
		}
		scan.close();
				
	}
}