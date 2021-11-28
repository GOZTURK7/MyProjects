package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_For_Each_Loop {

	public static void main(String[] args) {


		/*
		 * bazen index ile hiç uğraşmadan bir array veya listedeki tüm elemanları
		 * gözden geçirmek isteriz.
		 */
		
		int arr[] = {1,2,3,5,2,7};
		// bu array7i esnek bir list yapmak istiyorum.
		List<Integer> yeniList = new ArrayList<>();

		/*
		for (int i = 0; i < arr.length; i++) {
			yeniList.add(arr[i]);
			
		}System.out.println(yeniList);
		*/
		
		for (Integer each : arr) { // arr'deki herbir (each) int'i bana getir.
			
			yeniList.add(each);
		}System.out.println(yeniList);

		/*
		 * Eğer bir list veya array'in tüm elemanları elden geçirmek istiyorsa
		 * ve sıralam önemli değilse
		 * for-each loop kullanırız.
		 */
		
		
		
		
	}

}
