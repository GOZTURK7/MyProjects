package day23_multiDimensionalArrays;

public class C03_MDArraysTurkceSlideSoru1 {

	static int arr[][] = { { 1, 2 }, { 4, 5, 6, 7 } };

	public static void main(String[] args) {

		/*
		 * Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini
		 * ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
		 */

		int arr[][] = { { 1, 2 }, { 4, 5, 6, 7 }, {0,2,3,6,7} };

//		
//		int carpım=1;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				carpım*=arr[i][j];
//			}System.out.println(carpım);
//		}
//		
		carp(arr);
//		
//		
	}

	public static void carp(int[][] arr) {
		int carpım = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				carpım *= arr[i][j];
			}
			System.out.println(carpım);
		}

	}

}
