package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, 
    	//o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. 
    	//Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

      
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen pozitif bir tam sayı giriniz:");
    	int sayi = scan.nextInt();
    	
    	String result = (sayi >= 100 && sayi <= 999) ? ("Üç Basamaklı Sayı") : ((sayi%2==1) ? ("3 Basamaklı Olmayan Tek Sayı") : ("3 Basamaklı Olmayan Çift Sayı"));
    	
    	System.out.println(result);
    	
    	scan.close();
    }
}