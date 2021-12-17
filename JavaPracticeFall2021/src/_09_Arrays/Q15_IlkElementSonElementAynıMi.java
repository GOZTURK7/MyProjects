package _09_Arrays;

public class Q15_IlkElementSonElementAynıMi {

	public static void main(String[] args) {
		/*
		 * check your array's first and last elements are same (dizinizin ilk ve son
		 * elemanlarının ayni olup olmadığını kontrol eden kod yaziniz int
		 * []arr={2,6,4,8,2,6,2};
		 */

		int[] arr = { 2, 6, 4, 8, 2, 6, 2 };

		boolean ayniMi = false;
		if (arr[0] == arr[arr.length - 1]) {
			ayniMi = true;
		} else {
			ayniMi = false;
		}
		System.out.println("Array'in ilk dizi ve son dizisi aynı mı: " + ayniMi);

	}

}
