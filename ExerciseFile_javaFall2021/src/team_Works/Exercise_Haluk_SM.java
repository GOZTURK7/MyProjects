package team_Works;

import java.util.Scanner;

public class Exercise_Haluk_SM {

	public static void main(String[] args) {
		//Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
		
		/*
		  	1) kullanıcıdan input al.
		  	
		  	2) ilk kelimenin ilk harfini büyük harfle
		  			  	
		  	4) ikinci kelimenin ilk harfini
		  	
		  	5) üçüncü kelimenin ilk harfi
		 */
		
		
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Üç kelimeneden oluşan bir isim giriniz:");
			String isim = scan.nextLine().toUpperCase();	
			String ilkHarf = (String.valueOf(isim.charAt(0))); //Substring ile yapabiliriz	
			String ikinciHarf = (isim.substring(isim.indexOf(" ")+1, isim.indexOf(" ")+2));		
			String ucuncuHarf = (isim.substring(isim.lastIndexOf(" ")+1, isim.lastIndexOf(" ")+2));			
			
			
			System.out.println("isminiz : " + isim +  
					", " + ilkHarf + "." + ikinciHarf + "."+ ucuncuHarf + ".");
			
			scan.close();
			
			
			
			
	}

}
