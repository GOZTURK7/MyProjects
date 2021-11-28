package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C07_ArraysSoru1 {

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

		
		int birlesikArray [] = Arrays.copyOf(arr1, arr1.length + arr2.length);

		for (int j = 0; j < arr2.length; j++) {
			birlesikArray[j + arr1.length]=arr2[j];
		}
		return birlesikArray;
	}

}