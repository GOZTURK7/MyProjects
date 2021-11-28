package day_01;

import java.util.Scanner;

public class HomeWorkVariablesQ_11 {

	public static void main(String[] args) {
		 /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
        
  
         */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İsminizi Giriniz: ");
		String isim = scan.nextLine();
		System.out.print("Soyisminizi Giriniz: ");
		String soyisim = scan.nextLine();
		System.out.print("Yaşınızı Giriniz: ");
		int yas = scan.nextInt();
		System.out.print("Kilonuzu Giriniz: ");
		int kilo = scan.nextInt();
		System.out.print("Boyunuzu Giriniz : ");
		double boy = scan.nextDouble();
		System.out.print("Salona Kaç Ay Devam Edeceğinizi Giriniz: ");
		int ay = scan.nextInt();
		
		System.out.println("İsim:" + isim
				+"\nSoyisim: " + soyisim
				+"\nYaş: " + yas
				+"\nKilo: " + kilo
				+"\nBoy: " + boy
				+"\nSayın " + isim + " " + soyisim + " salonumuza " +ay+ " için " + "$"+(ay*20)+ " ücret ödemelesiniz." );
		
		scan.close();
	}

}
