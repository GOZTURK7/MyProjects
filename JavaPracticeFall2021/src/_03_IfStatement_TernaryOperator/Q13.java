package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen 1. Kenarı Giriniz: ");
    	int birinciKenar = scan.nextInt();
    	
    	System.out.println("Lütfen 2. Kenarı Giriniz: ");
    	int ikinciKenar = scan.nextInt();
    	
    	System.out.println("Lütfen 3. Kenarı Giriniz: ");
    	int ucuncuKenar = scan.nextInt();
    	
    	boolean dikUcgenMi = (birinciKenar*birinciKenar + ikinciKenar*ikinciKenar == ucuncuKenar*ucuncuKenar);
	
    	if(dikUcgenMi) {
        	System.out.println("Bu bir dik üçgen");
    	}else {
        	System.out.println("Bu bir dik üçgen değil");
    	}      
    	scan.close();

    }
}
