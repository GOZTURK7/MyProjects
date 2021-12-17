package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MultiDimensionalArrays {

	public static void main(String[] args) {


		/*
		 * Multi Dimensional Array'ler iç içe konulmuş arreyler demektir.
		 * Array oluşturmak için iki yöntemimiz vardı.
		 * 	1- Yöntem önce declare edip sonra değer atama,
		 * 
		 * 	int arr[][]=new int [3][2];   outer array'i 3 elemanlı 
		 * 
		 * 	her bir inner array ise 2 elemanlı olan MDArray oluşturur.
		 * 	bu yöntemle oluşturduğumuzda inner array'lerin hepsi aynı boyutta olmalıdır.
		 * 
		 * 	System.out.println(Arrays.toString(arr));     direk array'i yazdırmak istediğimizde içindeki
		 * 
		 * 	elemanlar non-primitive olduğundan referansları yazdırır. [[I@626b2d4a, [I@5e91993f, [I@1c4af82c]
			
			istediğimiz gibi yazdırmak için;
		 *	System.out.println(Arrays.deepToString(arr));   [[0, 0], [0, 0], [0, 0]]
		 * 		
		 */
		int arr[][]=new int [3][2];
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));

		
		System.out.println(Arrays.deepToString(arr));
		
		
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		System.out.println(Arrays.deepToString(arr));
		
		//  2- Yöntem hem declare edip hem de değer atamak

			int arr2[][]= {{0}, {1,2,3}, {6,7,8,9}};
			System.out.println(Arrays.deepToString(arr2)); //[[0], [1, 2, 3], [6, 7, 8, 9]]
			
			System.out.println(Arrays.toString(arr2[1])); //[1, 2, 3]
			System.out.println(arr2[2][1]); // 7
			
			
		
	}

}
