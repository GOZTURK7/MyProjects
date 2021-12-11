package RandomExercises;

import java.util.Scanner;

public class Ex_01_StringManupulation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter yoru kid's name: ");
		String kidName= scan.nextLine();
		
		if (kidName.contains("a") && kidName.contains("z")) {
			System.out.println("This name contains 'a' and 'z' ");
		}else if (kidName.contains("a")) {
			System.out.println("This name contains 'a' ");

		}else if (kidName.contains("z")) {
			System.out.println("This name contains 'z' ");

		}else {
			System.out.println("This name contains neither 'a nor 'z' ");

		}

		scan.close();
		
		
	}

}
