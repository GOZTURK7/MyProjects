package _10_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Q04 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

    	List<Integer> listNotlar = new ArrayList<>();

    	
    	Scanner scan = new Scanner(System.in);
    
    	
    	
    	String dewamkee="";
    	
    	do {
        	System.out.println("Lütfen notları giriniz.:");
        	int ogrNot=scan.nextInt();
        	System.out.println("dewamkee : E/H");
        	dewamkee=scan.next();
        	listNotlar.add(ogrNot);

    		
    		
    	}while(dewamkee.equalsIgnoreCase("E"));
    	
    	
    	// ortalamanın hesaplanması
    	
    	int toplam=0;
    	
    	for (int i = 0; i < listNotlar.size(); i++) {
			
    		toplam+=listNotlar.get(i);
		}
    	
    	double ortalama = toplam/listNotlar.size();
    	
    	// ortalamayı geçen öğrenci sayısı;
    	
    	int ortalamaGecenSayisi=0;
    	
    	for (int i = 0; i < listNotlar.size(); i++) {
			if (listNotlar.get(i)>ortalama) {
				ortalamaGecenSayisi++;
			}
		}System.out.println("Girilen notların ortalaması: "+ortalama+ 
				"\nOrtalamayı geçen öğrenci sayısı; " + ortalamaGecenSayisi);

		scan.close();
    }
}
