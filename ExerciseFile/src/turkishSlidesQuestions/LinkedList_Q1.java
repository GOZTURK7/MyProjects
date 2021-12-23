package turkishSlidesQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_Q1 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir isim girin:");
		String isim = scan.next();
		

		List<String> linkList= new LinkedList<>();
		
		
		linkList.add("Ali");
		linkList.add("Veli");
		linkList.add("Can");
		linkList.add("Ayşe");

		
		if (linkList.contains(isim)) {
			linkList.remove(isim);
			System.out.println(isim + " LinkedList'te vardı silindi.");
			System.out.println(linkList);
		}else {
			System.out.println(isim + " LinkedList'te yoktu silinemedi.");
			System.out.println(linkList);

		}
		
		
		System.out.println(linkList);
		
	}

}
