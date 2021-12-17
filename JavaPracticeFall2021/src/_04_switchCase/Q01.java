package _04_switchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		// 1. 0()dahil ile 50 arasi - D   
		// 2. 50(dahil) ile 60 arası - C   
		// 3. 60(dahil) ile 80 arası - B  
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen notunuzu giriniz");
		int not = scan.nextInt();
		
		switch(not/10) {
		
			case 10:
			case 9:
			case 8:
				System.out.println("Notunuz: " + not + " Harf Notunuz 'A' ");
				break;
			case 7:
			case 6:
				System.out.println("Notunuz: " + not + " Harf Notunuz 'B' ");
				break;
			case 5:
				System.out.println("Notunuz: " + not + " Harf Notunuz 'C' ");
				break;
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("Notunuz: " + not + " Harf Notunuz 'D' ");
				break;
			default:
				System.out.println("Lütfen geçerli bir not giriniz.");	
		}
		scan.close();
	}
}
