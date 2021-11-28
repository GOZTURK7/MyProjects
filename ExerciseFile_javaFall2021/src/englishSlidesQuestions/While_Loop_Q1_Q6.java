package englishSlidesQuestions;

import java.util.Scanner;

public class While_Loop_Q1_Q6 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		//Question 1: write a program to print numbers 1 to 5
		
		int num = 1;
		
		while(num<6) {
			System.out.print(num);
			num++;
		}
		
		
		
		// Qusetion 2: write a program that types first 30 consecutive odd integers
		
		int i = 1;
		
		while(i < 30) {
			if(i%2!=0) {
				System.out.println(i);
			}		
			i++;
		}
		
		
		// Qusetion 3: write a program that prompts the user to input a positive integer
		// it should then print the multiplication table of that number.
		
		System.out.println("Please enter an positive integer");
		int num1 = scan.nextInt();
		int i1 = 1;
		while (i1<11) {
			System.out.print(num1 + " X " + i1 + " = " + (num1*i1));
			
			i1++;
		}
		
		
		// Qusetion 4: write a program that promts the user to input a positive integer
		// it should then print factorial of that number.
		
		System.out.println("Please ente a positive integer2");
		int num2 = scan.nextInt();
		int factorial = 1;

		while (num2 > 0) {
			factorial*=num2;
			
			num2--;
		}System.out.print("Factorial of the number: " + factorial);

		
		
		
		// Qusetion 5: write a program to count the factors of an integer which is entered by user.
		
		System.out.println("Please enter an integer3");
		int num3 = scan.nextInt();
		int counter = 0;
		int i3 = 1;
		
		while(i3 <= num3) {
			if (num3%i3==0) {
				counter++;
			}
			
			
			i3++;
		}System.out.println("Positive Factors of the number is: " + counter);
		System.out.println("Negative Factors of the number is: " + counter);
		System.out.println("Factors of the number is: " + (counter*2));
		
		
		// Qusetion 6: write a program that promts the user to input an integer
		// it should then find sum of the digits of that number.
		
		System.out.println("Please enter an integer4");
		int num4 = scan.nextInt();
		int multiplication = 1;
		
		while(num4>0) {
			int n = num4%10;
			multiplication*=n;
			
			
			
			num4/=10;
		}System.out.println(multiplication);
		

		scan.close();

	}

}
