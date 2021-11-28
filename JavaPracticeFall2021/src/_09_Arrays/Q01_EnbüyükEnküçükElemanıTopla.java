package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_EnbüyükEnküçükElemanıTopla {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
	// kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki
	// farki gosteren
	// java programi yazin
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen array'in boyutunu girin");
		int arrboyut = scan.nextInt();

		int arr[] = new int[arrboyut];

		System.out.println("Array'in elemanlarını giriniz: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array'in" + (i + 1) + ". elemanını giriniz: ");
			
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arrboyut - 1] - arr[0]);
		
		scan.close();

	}

}
