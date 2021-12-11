package halukHoca;

import java.util.Scanner;

public class StringManupulation_003 {

	public static void main(String[] args) {

		//Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
		 /*Ahmet Emin Yılmaz
        A : adAd2Soyad.CharAt(0);
        E : 1.boşluk karakterinin indexinin 1 fazlası
        Y : Son boşluğun indexinin 1 fazlası */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("adınızı ve soyadınızı giriniz :");
        String isim = scan.nextLine();
	
		
		
		String formattedIsim = isim.substring(0,1).toUpperCase() +"."
				+ isim.substring(isim.indexOf(" ") +1, isim.indexOf(" ")+2).toUpperCase() +"."
				+ isim.substring(isim.lastIndexOf(" ") +1, isim.lastIndexOf(" ")+2).toUpperCase();
		System.out.println(formattedIsim);
	}

}
