package replit_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class List_Q7_RemoveSpecificEleInArray {

	public static void main(String[] args) {

		/*
		 * Soru7: write a Java program to removes a specific element from an array and
		 * put the remaining elements in a new array and prints the new array Input
		 * :{1,2,3,4,5,6} element:6 Output : [1,2,3,4,5]
		 */

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = new int[5];

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != input) {
				arr2[i] = arr1[i];
			}
		}System.out.println(Arrays.toString(arr2));
	}

}
