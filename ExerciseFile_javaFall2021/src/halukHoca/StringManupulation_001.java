package halukHoca;

import java.util.Scanner;

public class StringManupulation_001 {

	public static void main(String[] args) {
		 /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
//		
//		Scanner scan = new Scanner(System.in);
//        System.out.println("Lütfen adınızı girin: ");
//        String name = scan.next();
//        System.out.println("Lütfen soyadınızı girin: ");
//        String surName = scan.next();
//        System.out.println("Kredi Kartı numaranıazı 16 haneli olarak giriniz: ");
//        String cardNo = scan.next();
//        
//       
		Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı arada bir boşluk olacak şekilde girin :");
        String isim = scan.nextLine();
        System.out.println("Please enter your card no as 16 digits:");
        String cardNo = scan.nextLine().trim();
        
        String name1Formatted = isim.substring(0, 1).toUpperCase() + isim.substring(1,isim.indexOf(" ")).replaceAll("\\w", "*");
        String name2Formatted = isim.substring(isim.indexOf(" ")+1,isim.indexOf(" ")+2).toUpperCase()+isim.substring(isim.indexOf(" ")+2).replaceAll("\\w", "*");
        String cardNoFormatted = cardNo.trim().substring(0,12).replaceAll("\\d", "*") + cardNo.trim().substring(12, 16);
        
        if (cardNo.length() == 16) {
        	System.out.println("Adı Soyadı: " + name1Formatted +" "+ name2Formatted + " Card No: " + cardNoFormatted);
        }else {
        	System.out.println("Please enter your Card no as 16-digit");
        }
        scan.close();
		
	}

}
