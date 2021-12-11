package replit_Questions;

import java.util.Scanner;

public class ForLoop_Replit_Q1 {

	public static void main(String[] args) {

		/*
		 Kullanıcıdan bir isim ve bir karakter girmesini isteyin, 
		 ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 
		 
		 char ch1= 'a' ;

			String name =“John came late" 

			Expected Output:Number of a = 2

		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir isim ve bir karakter isteyin");
		String isim= scan.nextLine();
		
		char c = scan.next().charAt(0);
		int counter=0;
		
		for(int i=0; i<isim.length(); i++) {
			if(isim.charAt(i) == c) {
				counter+=1;
			}
		}System.out.println("Number of '" +c+ "' = " +counter);
		
		
		
	}

}
