package java_Oca_Interview_Questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class CountWords {

	public static void main(String[] args) {
		/*
	      Count the words in a String one by one
		  Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
		  
		  For Example:
		  Input :  String is "Ali came to school and Ayse came to school"
		  Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen strign giriniz: ");
		String str = scan.nextLine();
		
		
		List<String> input = new ArrayList<>(); 
		Collections.addAll(input, str.split(" ")); // input adını verdiğim listenin 
												// içine str adını verdiğim string cümleyi parçalayıp ekle;
		
		System.out.println(input); // sonra listeyi tekrar yazdır.
		
		List<String> listSon = new ArrayList<>(); 
		
		int counter=0;
		for (String w : input) {
			
			for (int i = 0; i < input.size(); i++) {
				
				if(input.get(i).equals(w)) {
					counter++;
				}
			}listSon.add(w + "= "+ counter);
			 counter=0;
			
		}System.out.println(listSon);
		
		
		
		
		
	}

}
