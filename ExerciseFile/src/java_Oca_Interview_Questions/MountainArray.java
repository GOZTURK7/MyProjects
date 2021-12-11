package java_Oca_Interview_Questions;

import java.util.Arrays;
import java.util.Iterator;

public class MountainArray {

	public static void main(String[] args) {


		/*
		Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value, decreasing constantly after the maximum value
		Not Mauntain Array--> [5, 2, 7, 1, 4] 

		Bir array elemanlari en buyuk degerine kadar surekli artan, 
		en buyuk degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
		 */
		int indexMax=0;
		int max = Integer.MIN_VALUE;
		int arr []= {5,4,3,2,1};
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>max) {
				max=arr[i];
				indexMax=i;
			}
		}System.out.println(max);
		
		boolean before = true;
		for (int i = 0; i < indexMax; i++) {
			
			if (arr[i] > arr[i+1]) {
				before=false;
				break;

			}
			
			
		}
		boolean after = true;
		for (int i = max+1; i < arr.length; i++) {
			
			if (arr[i] > max) {
				before=false;
				break;
			}
			
			
		}
		if (before == after) {
			System.out.println(Arrays.toString(arr)+ " Mountain Array");
		} else {
			System.out.println(Arrays.toString(arr)+ " Mountain Array Değil");


		}
		
		
		
	}

}
