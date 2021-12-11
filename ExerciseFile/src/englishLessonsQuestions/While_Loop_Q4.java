package englishLessonsQuestions;

import java.util.Scanner;

public class While_Loop_Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		/*
		 * QUESTİON 4
		 write a program that counts the factors of an integer  
		 which is enterede by user factors of 12 = 1,2 ,3,4, 5,6,12
		 */
		
		System.out.println("Plase enter an integer to calculete the factors:");
		int num = scan.nextInt();
		int countFactors=0;
		
		int i = 1;
		while(i<=num) {
			if(num%i==0) {
				countFactors+=i;
			}
			i++;
		}System.out.println("The Factors of " + num+ ": "+ countFactors );
		
		scan.close();
	}

}
