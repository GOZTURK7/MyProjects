package java_Oca_Interview_Questions;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JSpinner.ListEditor;

public class Interview_Questions_14_ÇokGüzelÇözümOldu {

	public static void main(String[] args) {

		/*
		 * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 } type a program to create a
		 * new array whose elements are like { 3, 5+1, 2+7+9, 2+3+5+7 }
		 * 
		 * Verilen bir arayın elemanlarının ardışık artan toplamını hesaplayıp yeni bir
		 * array'a atayan bir program cretae ediniz..
		 * 
		 * input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
		 * 
		 * output : { 3, 5+1, 2+7+9, 2+3+5+7 }
		 * 
		 */

		/*
		 * if the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 } type a program to create a
		 * new array whose elements are like { 3, 5+1, 2+7+9, 2+3+5+7 } Verilen bir
		 * arayin elemanlarinin ardisik artan toplamini hesaplayip yeni bir array'a
		 * atayan bir program cretae ediniz.. input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
		 * output : { 3, 5+1, 2+7+9, 2+3+5+7 }
		 */
		

		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7}; 
		
		List<Integer> liste = new ArrayList<>();
		
		int toplam=0;
		int indexBas = 0;
		int indexSon = 1;
		
		for (int i = 1; i < arr.length/2; i++) {
			
			for (int j = indexBas; j < indexSon; j++) {
				
				toplam+=arr[j];
				
			}
			liste.add(toplam);
			toplam=0;
			indexBas+=i;
			indexSon+=(i+1);
			
		}
		
		System.out.println(liste);
		
		
		
		

	}

}
