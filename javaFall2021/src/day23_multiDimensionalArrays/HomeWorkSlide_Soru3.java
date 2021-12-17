package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Iterator;

public class HomeWorkSlide_Soru3 {

	public static void main(String[] args) {

		/*
		 * Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e
		 * sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
		 * arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		 */

		int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };

		int toplam = 0;
		int uzunluk = 0;
	
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i].length < arr2[i].length) {
					uzunluk = arr1[i].length;
				}else if(arr1[i].length >= arr2[i].length) {
					uzunluk = arr2[i].length;
				}
			}

			for (int k = 0; k < uzunluk+1; k++) {

				for (int j = 0; j < uzunluk; j++) {
					System.out.println("arr1 : index:"+k+j +" " + arr1[k][j]);
					System.out.println("arr2 : index:"+k+j + " " + arr2[k][j]);
					toplam += (arr1[k][j]) + (arr2[k][j]);
					System.out.println(toplam);
				}
			}
			System.out.println(arr1[2].length);

			//break;

	}
	

}
