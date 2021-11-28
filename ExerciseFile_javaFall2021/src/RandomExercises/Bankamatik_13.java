package RandomExercises;

import java.util.Scanner;

public class Bankamatik_13 {

	public static void main(String[] args) {
		System.out.println("*****************************");
        System.out.println("ATM'ye Hoşgeldiniz...");

        String islemler = "1.İşlem : Bakiye Öğrenme\n2.İşlem : Para Yatırma\n"
                + "3.İşlem : Para Çekme\n"
                + "4.İşlem : Çıkış";

        System.out.println(islemler);
        System.out.println("*****************************");

        int bakiye = 1000;
        Scanner scan = new Scanner(System.in);

        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        String islem = scan.nextLine();
        
        switch(islem) {
        
        case "1" :
        	
        	System.out.println("Bakiyeniz: " + bakiye);
        	
        	break;
        
        case "2": 
        	System.out.println("Lütfen Yatırmak İstediğiniz Tutarı Girin:");
        	
        	int yatirilacakMiktar = scan.nextInt();
        	
        	bakiye += yatirilacakMiktar;
        	
        	System.out.println("Yeni Bakiyeniz " + bakiye);
        	
        	break;
        
        case "3" :
        	
        	System.out.println("Lütfen Çekmek İstediğiniz Tutarı Girin:");
        	
        	int cekilecekMiktar = scan.nextInt();
        	
        	if (cekilecekMiktar <= bakiye) {
        	
        		bakiye-=cekilecekMiktar;
            	
        		System.out.println("Kalan Bakiyeniz: " + bakiye);
        	
        	}else {
            
        		System.out.println("Yetersiz Bakiye, Bakiyeniz: " + bakiye 
            			+"\nÇekmek istediğiniz tutar: " + cekilecekMiktar);
        	}break;	
        	
        case "4" :
        	
        	System.out.println("Çıkış yapılıyor ...." );
        	
        	break;
        	
        }
        scan.close();
	}

}
