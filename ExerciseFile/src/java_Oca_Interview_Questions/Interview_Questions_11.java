package java_Oca_Interview_Questions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Interview_Questions_11 {

	public static void main(String[] args) {
				/*
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.
		
		kullanıcının girdigi bir array'in en buyuk elemani ile 
		en kucuk elemanının  farkını bulan bir method create ediniz.
				 	*/
		
		
		Scanner scan = new Scanner(System.in);
		
		String num = scan.next();
		String arr1[]=num.split("");		
		Arrays.sort(arr1);
		
		int sonuc=Integer.parseInt(arr1[arr1.length-1]) -Integer.parseInt(arr1[0]);
		System.out.println(sonuc);
		
		
	}

}
