package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
	   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
	   toplamını bulunuz. Sonucu ekrana yazdırınız.
	    */
    	
    	// listeye atamak için eleman isteyin kullanıcıdan alın list

    	List<String> list = new ArrayList<>();

    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Listeye atamak için sayı giriniz:  ");
    	
    	System.out.println("Yeterli sayıya ulaştığınızda 'q' ya basınız. ");
    	
    	int toplam = 0;
    	
    	String islem="";
    	
    	while(!islem.equalsIgnoreCase("q")) {
        	System.out.println("sayı giriniz:  ");
        	islem=scan.next();
        	list.add(islem);		
    	}
    	
    	list.remove(list.size()-1); // içinde q bulunmayan sadece sayı bulunan list haline geldi.
    	
    	// list elemanları içine girip kareleri toplamı bulun
    	
    	for (String w : list) {
    		int a=Integer.parseInt(w);
			toplam+=(a*a);
		}
    	System.out.println("Toplam: "+ toplam);
    	
    	scan.close();
    	
    	
    
    }
}
