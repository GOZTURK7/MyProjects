package day21_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {

		
		int arr [] = {2,4,6,8,78,89};
		
		
		/*
		 * bir array'in tüm elementleri yazdırabiliriz.
		 */
		
		// 1. yol loop ile 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 2. yol (asıl) yada Arrays Class'ından yardım alıp direkt array olarak yazdırabiliriz.
		
		System.out.println(Arrays.toString(arr)); 
		
	
		
		
		
		
	}

}
