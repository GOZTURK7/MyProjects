package englishLessonsQuestions;

import java.util.Scanner;

public class While_Loop_Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * QUESTİON 3
		 write a program that promts the user to input an integer ,
		 it should then find the sum of the digits of that numbers
		 ex: int num = 123 sum of that : 1 + 2 + 3 = 6
		 */
		
		
		System.out.println("Please enter an integer:");
		int num = scan.nextInt();
		int sumOfDigits = 0;
		
		while(num > 0) {
			
			sumOfDigits = sumOfDigits + (num%10);
			
			
			num/=10;
		}System.out.println("Sum of the number:"+ sumOfDigits);
		
		scan.close();
	}

}
