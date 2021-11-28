package day21_scope_arrays;

import java.util.Arrays;

public class C06_ArraysTurkceSlideSoru2 {

	public static void main(String[] args) {
		
		
		//Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		
		int arr [] = {3, 5, 8, 65, 32, 34};
		
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}System.out.println(toplam);
		

		
		
		
		// Array' in tüm elemanlarını önce küçükten büyüğe sonra büyükten küçüğe doğru yazdırın.
		
		// küçükten büyüğe
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i] + " ");
			
		}
		// array yapmak isterseniz aynı uzunlukta bir array oluşturup 
		//elemanları ters sırada yeni array'e taşıyabiliriz

		int tersArray[]=new int[arr.length];
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i] = arr[arr.length-1-i];
			
		}System.out.println(Arrays.toString(tersArray));
		
	}

}
