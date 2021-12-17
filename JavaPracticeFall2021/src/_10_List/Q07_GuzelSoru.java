package _10_List;

import java.util.Arrays;

public class Q07_GuzelSoru {

	public static void main(String[] args) {
		/*
		 * ayna check sorusu: input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 }; output :
		 * verilen array simetriktir
		 */

		int arr1[] = {1, 2, 3, 4, 4, 3, 2, 1};

		int j = arr1.length - 1;
		for (int i = 0; i < arr1.length / 2; i++) {

			if (arr1[i] == arr1[j]) {
				j--;
				if (j == arr1.length / 2) {
					System.out.println("verilen array "+ Arrays.toString(arr1)+ " simetriktir.");
					break;

				}
			} else {
				System.out.println("verilen array "+ Arrays.toString(arr1)+ " simetrik değildir.");
				break;
			}

		}

	}

}
