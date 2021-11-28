package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_ArraysSoru {

	public static void main(String[] args) {
/*
 * verilen iki array'i birleştiren ve sonucu birleşikArray isminde bir array'e kaydeden
 * bir method oluşturunuz.
 */
		
		int arr1 []= {3,5,7,10};
		int arr2 []= {2,4,6,8,9};
				
		
		int birlesikArray[]=birlestir(arr1, arr2);
		
		System.out.println(Arrays.toString(birlesikArray));
		
		
	}

	private static int[] birlestir(int[] arr1, int[] arr2) {

		
		int birlesikArray [] = new int [arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			birlesikArray[i]=arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			birlesikArray[j + arr1.length]=arr2[j];
		}
		return birlesikArray;
	}

}
