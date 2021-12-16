package java_Oca_Interview_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TekrarlıElemanSil {

	public static void main(String[] args) {

		/*
		 * Create a list by getting the list elements from user if there is duplicated
		 * elements remove them from the list. ​ Kullanıcıdan aldıgınız elemanlardan
		 * oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
		 */

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		List<String> list1 = List.of(str.replaceAll(" ", "").split(""));
		List<String> list2 = new ArrayList<>();

		for (String string : list1) {

			if (!list2.contains(string)) {
				list2.add(string);
			}

		}
		System.out.println(list1);
		System.out.println(list2);

	}

}
