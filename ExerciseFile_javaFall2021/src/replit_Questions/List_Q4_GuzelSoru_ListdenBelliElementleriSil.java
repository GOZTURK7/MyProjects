package replit_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List_Q4_GuzelSoru_ListdenBelliElementleriSil {

	public static void main(String[] args) {

		/*
		 * Soru4: Write a program that deletes the letters 'a' from the names in the
		 * list given as input.
		 * 
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 * 
		 * OUTPUT :
		 * 
		 * [Veli,Omer]
		 * 
		 */

		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");

		System.out.println(list1); // to check

		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).startsWith("A") || list1.get(i).startsWith("a")) {
				list1.remove(i);

			}
		}

		System.out.println(list1);
	}

}
