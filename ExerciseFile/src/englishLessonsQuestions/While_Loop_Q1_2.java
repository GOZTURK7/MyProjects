package englishLessonsQuestions;

import java.util.Scanner;

public class While_Loop_Q1_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// type code to print "Hi" 5 times on the console.
		
		int i = 1;
		
		while(i<6) {
			System.out.println("Hi");
			
			i++;
		}
		
		
		// Question 2; Write a program that promts the user to input a number 
		// it should print the multiplication of the number likes this
		// 3x1=3 .............3x10=30
		System.out.println("Please enter an integer");
		int num = scan.nextInt();
		
		int i1 = 1;
		
		while(i1<11) {
			System.out.println(num + "x"+ i1 + "=" + (num*i1));
			
			i1++;
		}
		scan.close();
	}

}
