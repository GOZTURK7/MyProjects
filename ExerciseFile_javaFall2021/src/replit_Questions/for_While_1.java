package replit_Questions;

import java.util.Scanner;

public class for_While_1 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a name and a character, 
		 then check how many times the character is repeated in the name using loops in the name

				e.g:
				
				char ch1= 'a' ;
				
				String name =“John came late"
				
				Expected Output: Number of a = 2
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character: ");
		char character = scan.nextLine().charAt(0);
		System.out.println("Please enter a string: ");
		String str = scan.nextLine();
		
		int count = 0;
		for(int i =0; i<str.length(); i++) {
			char sc = str.charAt(i);
			if(sc == character) {
				count+=1;
			}
		}System.out.println(count);
		scan.close();
	}

}
