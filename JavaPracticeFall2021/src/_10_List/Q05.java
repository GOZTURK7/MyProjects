package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		// Kullanıcıdan alacağınız 6 elemanlı bir dizinin
		// sadece tek elemanlarını ayrı diziye bir metodda atayarak
		// main de yazdırınız.

		int arr[] = new int[6];

		tekSayilar(arr);

	}

	public static void tekSayilar(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 6 sayı giriniz;");
		int counter = 0;
		while (counter < 6) {
			int num = scan.nextInt();
			arr[counter] = num;
			counter++;
			System.out.println(counter + ". Sayı:" + num);
		}
		System.out.println(Arrays.toString(arr));
		List<Integer> liste = new ArrayList<>();
		for (int i : arr) {
			if (i % 2 != 0) {
				liste.add(i);
			}
		}
		System.out.println(liste);

	}

}
