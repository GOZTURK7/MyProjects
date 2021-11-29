package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
     //listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

    	
    	
    	String isim [][] = {{"Ali" ,"Veli" ,"Ayse"},{"Hasan","Can"},{"Suzan"}};
    	
//    	List<String> isim1 = new ArrayList<>();
//
//    	for (String[] arr : isim) {
//			
//    		
//    		for (int i = 0; i < arr.length; i++) {
//				
//    			isim1.add(arr[i]);
//    			
//			}
//		}
//    	System.out.println(isim1);
//    	System.out.println("Sıralamadan sonra yazdıralım");
//
//    	Collections.sort(isim1);
//    	System.out.println(isim1);
//
//    	
    	yeniList(isim);
    	
    	
    }
    
    public static void yeniList (String [][] isim) {
    	
    	List<String> isim1 = new ArrayList<>();

    	for (String[] w : isim) {
			
    		
    		for (int i = 0; i < w.length; i++) {
				
    			isim1.add(w[i]);
    			
			}
		}
    	System.out.println(isim1);
    	System.out.println("Sıralamadan sonra yazdıralım");

    	Collections.sort(isim1);
    	System.out.println(isim1);
    	
    }

}
