package java_Oca_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRepeatedCharacters {

	public static void main(String[] args) {
		/*
		 * Create method that finds repeated characters in a String Bir String'de
		 * tekrarlanan karakterleri bulan method create ediniz
		 */

		String str = "aaabbbcddeefgh";

		String arr[] = str.split("");

		System.out.println(Arrays.toString(arr));

		String repeatedStr = "";

		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j]) && !repeatedStr.contains(arr[i])) {
					repeatedStr += arr[i];
					break;

				} else {
					flag = false;
				}
			}

		}
		System.out.println("Repeated Ones: " + repeatedStr);

	}

}
