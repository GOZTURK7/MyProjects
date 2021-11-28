package englishSlidesQuestions;

public class ForLoop_Q1_Q6 {

	public static void main(String[] args) {

		/*
		 Question 1 : Write a program to print counting numbers 
		 from 10 to 57 on the console by using for loop
		 
		 */
		
		for (int i = 10; i <58; i++) {
			
			System.out.println(i);
		}
		
		/*
		 Question 2 : Write a program to print even counting numbers 
		 from 100 to 43 on the console by using for loop
		 */
		
		for (int i = 100; i > 42; i--) {
			
			System.out.println(i);
		}
		
		/*
		 Question 3 : Write a program to print odd counting numbers 
		 from 200 to 33 on the console by using for loop
		 */
		
		for (int i = 200; i > 32; i--) {
			System.out.println(i);
		}
		
		
		/*
		 Question 4 : Write a program to add  counting numbers 
		 from 23 to 57 on the console by using for loop.
		 print the sum on the console
		 */
		
		int sum = 0;
		for(int i=23; i<58; i++) {
			sum+=i;
		}
		System.out.println(sum); //1400

		/*
		 Question 5 : Write a program to multiply counting numbers 
		 from 7 to 15 on the console by using for loop.
		 print the multiplication on the console
		 */
		
		int multi = 1;
		for(int i=7; i<16; i++){
			multi*=i;
		}
		System.out.println(multi);
		
		/*
		 Question 6 : Write a program to print counting numbers 
		 which are less than 200 and divisible by 5 on the console by using for loop.
		 print the multiplication on the console
		 */
		
		for (int i= 200; i>0; i--) {
			if (i%5 == 0) {
				System.out.println(i);
			}
			
			
			
		}
		
	}

}
