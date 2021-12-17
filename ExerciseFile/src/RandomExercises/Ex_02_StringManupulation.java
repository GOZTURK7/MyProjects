package RandomExercises;

import java.util.Scanner;

public class Ex_02_StringManupulation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter yoru kid's name: ");
		String letter= scan.next();
		char startLetter = letter.charAt(0);
		
		String a = (startLetter >= 'A' && startLetter <= 'Z') 
				? ((startLetter < 'F' ) 
				? ("Big Before F") : (startLetter > 'F') 
				? ("Big after F") : ("it is F")) :
				((startLetter >= 'a' && startLetter <= 'z') 
				? ((startLetter < 'h') 
				? ("Smal before h") : ((startLetter > 'h') 
				? ("Big after h"): ("it is h"))) : ("this is not letter"));
		scan.close();
		
		System.out.println(a);
	}

}
