package Team_Working_Proje1;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */



 /*

    Veri tipi integer olan max sayısı verildiğinde

    0 ile max sayisi arasindan random bir sayi elde et(olustur)

    output tipi int olmalı


  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int max=scanner.nextInt();
        
       
        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

       List<Integer> liste = new ArrayList<>();
       
       for (int i = 0; i <= max; i++) {
		
    	   liste.add(i);
	}
       //System.out.println("Before Shuffle: "+ liste);
       
       Collections.shuffle(liste);   // sorunun can alıcı noktası burası listenin shuffle metodu ile girilen sayıya kadar
       								// olan rakamları dağınık bir şekilde karışık bir hale getiriy shuffle,
       								// örneğin Before Shuffle: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
       								//	       After Shuffle : [4, 0, 3, 1, 6, 2, 8, 5, 9, 10, 7]


       int arr [] = new int [liste.size()]; // burada tekrar shuffle edilmiş liste elamanlarını array'in içine atıyorum ki
       										// Array'in binarySearch metodunu kullanabileyim.
       
       for (int i = 0; i < liste.size(); i++) {
		
    	   arr[i]=liste.get(i);
	}
       
       
       
       int random = Arrays.binarySearch(arr, 5); // sorunun ikinci can alıcı noktası burası burada da binary search'e diyorum ki,
       											// arr 'in içinde 5 elementinin indexini bul getir bana ama arr sort edilmediği 
       											// için binarySearch her seferinde bana farklı bir index getiriyor,
       
       if(random < 0) {							// sorunun üçüncü önemli noktası da burası binary search bana her zaman farklı
    	   										// bir index getiriyor ama bazen bulamadım deyip negatif döndüğü için burada
    	   										// negatif ise eksi bir ile çarparak yine pozitif yapıyoruz
    	   random*=(-1);
    	   System.out.println(random);
       }else {
    	   System.out.println(random); // sonuç olarak bize her zaman girilen değere kadar olan rakamlardan bir tanesini
    	   								// random olarak döndürüyor.
       }
     
        //System.out.println("After Shuffle"+Arrays.toString(arr));
        
       
        
        
       
        
        
        
        
        
        
        
    }
}