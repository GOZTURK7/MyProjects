package replit_Questions;

import java.util.ArrayList;
import java.util.List;

public class List_Q6_FindTheCommonElementsInTwoArrays {

	public static void main(String[] args) {

			/*
			 * Soru6:
				Write a program to find the common elements between two String Arrays (without case sensitivity)
				Input1 : {John,Brad,Ange,Sofia,Emily}
				Input2 : {sofia,brad,grace,emily,hazel}
				Output : [sofia,brad,emily]


			 */
		
		String arr1 [] = {"John","Brad","Ange","Sofia","Emily"};
		String arr2 [] = {"grace","brad","hazel","sofia","emily"};
		List<String> liste = new ArrayList<>();
		
		
		for (String w : arr1) {
			
			for (String i : arr2) {
				
				if(w.equalsIgnoreCase(i)) {
					
					liste.add(w);
				}
			}
		}System.out.println(liste);
		
		

		
		
		
	}

}
