package day03_SwapVariable_Scanner;

import java.util.Scanner;

public class C06_Scanener {

	public static void main(String[] args) {

		// Scanner işleminde String için iki method vardır.
		// scan.next() dediğimizde sadece bir kelim alır.(İLK SPACE'E KADAR GİRİLEN METNİ ALIYOR)
		// eğer kullanıcıdan daha fazla kelime gelme ihtimali varsa scan.nextLine() kullanmalıyız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen isminizi giriniz..: ");
		
		String isim = scan.nextLine();
		
		System.out.println("Lütfen soyisminizi yazınız..:");
		
		String soyisim = scan.nextLine();
		
		System.out.println("girilen isim : " + isim +" "+ soyisim);
		
	}

}
