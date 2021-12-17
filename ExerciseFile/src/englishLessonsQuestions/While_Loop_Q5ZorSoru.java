package englishLessonsQuestions;

import java.util.Scanner;

public class While_Loop_Q5ZorSoru {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		 * QUESTİON 5
		Ask user to enter the nuber of rows to create following image 
		if user gives you 4;
		A1
		AB2
		ABC3
		ABCD4
		 */
		
		System.out.println("Please enter the number of rows:");
		int row=scan.nextInt();
		
		int i=1;
		char c = 'A';
		
		while(i<=row) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(c);
				c++;
				
			}
			c = 'A';
			System.out.println(i);
			i++;
		}
		scan.close();
	}

}
