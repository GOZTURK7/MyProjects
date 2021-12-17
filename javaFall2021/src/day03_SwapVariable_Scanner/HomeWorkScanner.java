package day03_SwapVariable_Scanner;


import java.util.Scanner;

public class HomeWorkScanner {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 1- Kullanıcadan iki tam sayı alıp bu sayıların toplam, fark ve çarpımlarını yazdırın.
		
		System.out.println("Lütfen 1'inci Sayıyı Giriniz: ");
		
		int sayi1 = scan.nextInt();
		
		System.out.println("Lütfen 2'inci Sayıyı Giriniz: ");
			
		int sayi2 = scan.nextInt();
				
		System.out.println("Sayıların Toplamı :" + (sayi1 + sayi2));
		System.out.println("Sayıların Farkı :" + (sayi1 - sayi2));
		System.out.println("Sayıların Çarpımı :" + (sayi1 * sayi2));
		
		// 2- Kullanıcıdan karenin bir kenar uzunluğunu alın ve karenin çevresini ve alanını hesaplayıp yazdırın.
		
		System.out.println("lütfen Karenin Bir Kenar Uzunluğunu Yazın.");
		
		int kenar = scan.nextInt();
		
		System.out.println("Karenizin Çevresi: " + (kenar*4) + ", Karenizin Alanı: " + (kenar*kenar));

		
		// 3- Kullanıcıdan yarıçap isteyip çemberin çevresini ve dairenin alanını hesaplayıp yazdırın.
		
		System.out.println("Lütfen Çemberinizin Yarıçapını Giriniz: ");
		
		int yarıcap = scan.nextInt();
		double pi = 3.141592653589793;
		
		System.out.println("Çemberinizin Çevresi: " + (yarıcap * 2 * pi) + ", Çemberinizin Alanı: " + (pi * yarıcap * yarıcap));

		// 4- Kullanıcıdan dikdörtgenler prizmasının uzun, kısa kenarlarını ve yüksekliğini isteyip prizmanın hacmini bulun.
		
		
		System.out.println("Dikdörtgenler Prizmasının Uzun Kenarı: ");
		
		int a = scan.nextInt();
		
		System.out.println("Dikdörtgenler Prizmasının Kısa Kenarı: ");

		int b = scan.nextInt();
		
		System.out.println("Dikdörtgenler Prizmasının Yüksekliği : ");

		int h = scan.nextInt();

		System.out.println("Dikdörtgenler Prizmasının Hacmi: " + (a*b*h));

		
		// 5- Kullanıcıdan ismini ve soyismini isteyip aşağıdaki şekilde yazdırın.
		// İsminiz: Mehmet
		// Soyisminiz: Bulut
		// Kursumuza Kaydınız Alınmıştır, Teşekkür Ederiz.
		
		

		System.out.println("Lütfen Adınızı Giriniz: ");
		
		String adı = scan.next();
		
		System.out.println("Lütfen Soyadınızı Giriniz: ");

		String soyad = scan.next();
		
		System.out.println("Kursumuza kaydınız alınmıştır, teşekkür ederiz.");

		
		// 6- Kullanıcıdan ismini ve soyadını alıp aralarında bir boşluk bırakarak 
		// şu şekilde yazdırın;
		// İsim - soyisim : Mehmet Bulutluöz.
		
		System.out.println("Lütfen İsminizi Giriniz: ");

		String isim = scan.next();
		
		System.out.println("Lütfen Soyisminizi Giriniz: ");

		String soyisim = scan.next();
		
		System.out.println("İsim - soyisim : " + isim +" " + soyisim);
		
		
	}

}
