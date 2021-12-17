package Projects_03;

import java.util.Scanner;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
	public static boolean threeEvenOrOdd(int[] arr) {
		
		int even = 0;
		int odd = 0;
		
		for (int i : arr) {
			
			if(i%2==0) even++;
			else if(i%2==1) odd++;
		}
		
		if(even >= 3 || odd >= 3) return true;
		else return false;
		
		
		}
	
}