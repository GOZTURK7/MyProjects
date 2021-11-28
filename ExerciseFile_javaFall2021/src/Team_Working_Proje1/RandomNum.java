package Team_Working_Proje1;

import java.util.Arrays;
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
        System.out.print("bir sasyi giriniz : ");
        int max=scanner.nextInt();
        
       
        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

        int arr[] = new int [max];
        
        int counter=0;
        do {
        	
        	int value=0;
        	arr[counter]=value;
        	
        	
        	
        	counter++;
        }while(counter!=max);
        
        System.out.println(Arrays.toString(arr));
        
        
        /*
         * Sözde rassal (rastgele) sayı üreteci (pseudorandom number generator, 
         * PRNG, sözde rastgele), öğeleri arasında kolay kolay 
         * ilişki kurulamayacak bir sayı dizisi üreten algoritma türlerine verilen genel isimdir.

			Sözde rassal sayı üreteçlerinin çıktıları gerçek anlamda rassal değildir, 
			bu tür algoritmalar gerçek rassal sayı dizilerinin bazı özelliklerini yaklaşık olarak taşır. 
			John von Neumann'ın da belirttiği gibi 
			"Aritmetik yöntemlerle rassal sayılar üretmeye çalışan biri büyük günah işliyordur.
			[1]" Her ne kadar rassal sayılar donanımsal rassal sayı üreteçleri ile üretiliyor olsa da, 
			sözde rassal sayılar modern bilgiişlemin önemli bir bölümünü kapsamaktadır ve 
			bunlar kriptolojiden tutun fiziksel sistemleri simüle etmeye yarayan 
			Monte Carlo yöntemlerine dek pek çok yerde kullanılmaktadır. 		
         * 
         */
        
        
        /*
         * Basit bit PRNG üreteç, bir önceki sayıyı a ile çarpıp b ile toplayıp 
         * sonucun modunu alarak sıradaki “sözde” rassal sayıyı üretir. 
         * Kullanılan üretece göre farklı algoritmalar sözkonusu olabilir. 
         * Örneğin büyük bir sayı üretilip onun n. basamağından k. basamağına kadar olan 
         * sayıyı almak da belirli bir rassallık sağlar.
         */
		
     
        
        
        
        
        
        
        
    }
}