package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.
    	Scanner scan = new Scanner(System.in);
        System.out.println("lütfen beş adet tamsayı giriniz:");
    	
        
        int toplam = 0;
    	
    	for(int i=0; i<5; i++) {
    		int num=scan.nextInt();
    		if (num >4 && num<11) {
				continue;  // es geçip alt satırdan devam ediyor.
			}
				toplam+=num;
			
    	}System.out.println("sayıların toplamı: " + toplam);
    	
    	
    }

}
