package _04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.



        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.


      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Frankfurt : 60 KM, \nKöln : 80 KM "
    			+ "\n20 KM başına 5 euro bilet parası alınmaktadir.." 
    			+ "\nNereye yolculuk etmek istiyorsunuz? ");
    	String nereye = scan.next().toUpperCase();
    	if (nereye.equals("KOLN") || nereye.equals("FRANKFURT")) {
		
	    	System.out.println("Kaç kişilik bilet istiyorsunuz (max 2 kişi olabilir)");
			int kacKisi = scan.nextInt();
		
			double ucretKoln = (80/20)*5;
	    	double ucretFrk = (60/20)*5;
	    	if (nereye.equals("KOLN")) {
	    		switch (kacKisi) {
	    		case 1:
	    			System.out.println("Bir Kişilik "
	    				+ "\nRota :" + nereye 
	    				+ "\nYol Ücreti:" 
	    				+ ucretKoln + "Euro");
	    		break;  		
	    		case 2:
	    			ucretKoln *= 2;
	    			System.out.println("İki Kişilik "
	       				+ "\nRota :" + nereye 
	       				+ "\nYol Ücreti:" 
	       				+ ucretKoln + "Euro");
	    		break;   		
	    		default:
	        		System.out.println("Maksimim iki kişilik seçebilirsiniz.");
	    		}
	    	
	    	}else {
				switch (kacKisi) {
	    		case 1:
	    			System.out.println("Bir Kişilik "
	    				+ "\nRota :" + nereye 
	    				+ "\nYol Ücreti:" 
	    				+ ucretFrk + "Euro");
	    		break;  		
	    		case 2:
	    			ucretFrk *= 2;
	    			System.out.println("İki Kişilik "
	    				+ "\nRota :" + nereye 
	    				+ "\nYol Ücreti:" 
	    				+ ucretFrk + "Euro");
	    		break;   		
	    		default:
	    		System.out.println("Maksimim iki kişilik seçebilirsiniz.");
	    		}
			
	    	}System.out.println(nereye + " " + kacKisi + " kişilik "
	    						+ "\nLütfen vereceğiniz miktarı girin:");
	    	double bakiye = scan.nextDouble();
	    	System.out.println("Bakiyeniz :" + bakiye +"Euro");
	    	if (nereye.equals("KOLN")) {
	    		System.out.println("Para üstü: " + (bakiye - ucretKoln));
	    	}else {
	    		System.out.println("Para üstü: " + (bakiye - ucretFrk));
	    	}
    	}else {
	    	System.out.println("Lütfen geçerli bir şehir giriniz:");
	    }
    	scan.close();
    	
    }	
}
