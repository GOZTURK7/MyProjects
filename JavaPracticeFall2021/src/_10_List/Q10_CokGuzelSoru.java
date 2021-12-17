package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q10_CokGuzelSoru {
	/*
	 * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 } type a program to create a
	 * new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
	 */
	public static void main(String[] args) {

		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };

		List<Integer> list = new ArrayList<>();

		int a=0;
		int toplam=0;
		for ( int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j <= i; j++) {
				if(a<10) {
					toplam+=arr[a];					
					a++;
				}else {
					break;
				}
			}
				
			System.out.println(a);
			list.add(toplam);
			toplam=0;
			if (a==arr.length) {
				break;
			}
		}
		System.out.println(list);
		
		
	}
}
