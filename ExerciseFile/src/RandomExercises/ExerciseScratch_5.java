package RandomExercises;

import java.util.Scanner;

public class ExerciseScratch_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num = scan.nextInt();
	
		System.out.println("Enter one more integer");
		int num2 = scan.nextInt();
	
		if (num%2 == 0) {
			System.out.println(num + " is Even");		
		}
		
		if(num%2!=0) { // Burada (num%2 == 1) olarak yazsaydık negatif sayıları gözden kaçırırdı.
			System.out.println(num + " is Odd");		
		}
	
	// Get two numbers from user if they equal to each other , print square on the console,
		if (num == num2) {
			System.out.println("it is a square");
		}
	
		scan.close();
		
		
	}

}
