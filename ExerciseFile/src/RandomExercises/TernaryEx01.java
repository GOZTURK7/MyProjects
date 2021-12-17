package RandomExercises;

import java.util.Scanner;

public class TernaryEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		
		System.out.println((num<10) ? (num*num) : ((num >10) ? (num +2): (num)));
		scan.close();
	}


}
