package _07_ForLoop;

import java.util.Scanner;

public class Q12_KarelerToplamı {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer bigger than one");
		int num = scan.nextInt();

		int karelerToplamı=0;
		
		for(int i=1; i<num+1; i++) {
			karelerToplamı+=(i*i);
		}System.out.println("kareler toplamı: " + karelerToplamı);
        
		scan.close();
    }
}
