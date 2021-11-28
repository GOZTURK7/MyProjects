package RandomExercises;

import java.util.Scanner;

public class Ex_03_StringManupulation {

	public static void main(String[] args) {

		/*
		 Ask user ta enter his/her first and last name. 
		 If the first name is longer output will be “First name is longer.” 
		 If the length of last name is equal To the length of last name output will be 
		 “First name and last name have same length.” Otherwise, output will be “Last name is longer”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name and push enter to enter your last name; ");
		String firstName= scan.next();
		String lastName = scan.next();
		
		int uzunlukFirst = firstName.length();
		int uzunlukLast = lastName.length();
		
		
		if (uzunlukFirst > uzunlukLast) {
			System.out.println("First name longer");
		}else if (uzunlukFirst == uzunlukLast) {
			System.out.println("First name and last name have same length");
		}else {
			System.out.println("Last name is longer");
		}
		scan.close();
	}

}
