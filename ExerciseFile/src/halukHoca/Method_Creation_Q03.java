package halukHoca;

import java.util.Scanner;

public class Method_Creation_Q03 {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
    	
    	Scanner scan = new Scanner(System.in);

		System.out.println("çevrilecek birimi seçin "
				+ "\n  saat, mil, kilo");
		String birim = scan.next();
		System.out.println("çevrileceke birimin miktarını seçin");
		double miktar = scan.nextDouble();
    	cevir(birim, miktar);

    	
        
      
    }

	private static void cevir(String brm, double mktr) {
		switch(brm) {
		case "saat":
			double saniye = mktr*3600;
			System.out.println("girilen saatin saniye değeri: " + saniye);
			break;
		case "mil":
			double mil = mktr*1.609344;
			System.out.println("girilen mil'in kilometre değeri: " + mil);
			break;
		case "kilogram":
			double kilogram = mktr*1000;
			System.out.println("girilen kilgramın gram değeri: " + kilogram);
			break;
		default:
			System.out.println("Bu saatte kafalar bin beş yüz !!!!");
			break;
		}
		
	}
}

