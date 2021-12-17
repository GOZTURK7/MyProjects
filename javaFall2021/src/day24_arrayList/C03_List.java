package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List {

	public static void main(String[] args) {

		/*
		 * Verilen bir array'den istenen değere sahip elementleri silip kalanı yeni bir array
		 * olarak kaydedin ve sonra yeni array'i yazdırın.
		 */
		
		
		int [] arr= {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman=3;
		
		List<Integer> gecici = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=silinecekEleman) {
				gecici.add(arr[i]);
			}
		}System.out.println("List olarak:  "+gecici);
		
		//sonucu arra olarak istiyorsak
		// listedekileri yeni array'e ekleyebiliriz.
		
		int yeniArray []= new int[gecici.size()];
		
		for (int i = 0; i < yeniArray.length; i++) {
			yeniArray[i]=gecici.get(i);
		}System.out.println("Array olarak: "+Arrays.toString(yeniArray));
		
		
		
		
	}

}
