package englishSlidesQuestions;

import java.util.Scanner;

public class Do_While_Loop_Q1_Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		/*
		 QUESTİON 1 
		 write a program to print numers from 1 to 5 on the console by using do-while loop.
		 */
		
		int i=1;
		int sum = 0;
		
		do {
			sum+=i;
			i++;
		}
		while(i<6);
		System.out.println(sum);
		
		
		
		/*
		 QUESTİON 2 
		 write a program to print numbers from 10 to 3 on the console by using do-while loop.
		 */
		
		int i1=10;
		
		do {	
			System.out.println(i1);
			i1--;
		}while(i1>2);
		
		
		/*
		 QUESTİON 3 
		 write a program to print numbers which are divisible by 5 
		 between 1 and 100 on the console by using do-while loop.
		 */
				
		
		int i3=1;
		
		do {
			if(i3%5==0) {
				System.out.println("   " +i3);
			}
			
			
			i3++;
		}while(i3<101);
		
		

		/*
		 QUESTİON 4 
		 write a program to print letters from c to m on the console by using do-while loop.
		 */
		
		char c='c';
		
		do {
			System.out.println(c);
			c++;
			
		}while(c<='m');
		
		
		
		
		/*
		 QUESTİON 5 
		 ask user to enter a number,
		 if the number divisible by 10 then print "Won" onthe console,
		 otherwise ask user to enter another number.
		 use do-while loop.
		 */
		
		
		///// 1.WAY /////
		
		boolean flag = true;
		
		do {
			System.out.println("Please enter a number:");
			int num=scan.nextInt();
			if(num%5==0) {
				System.out.println("You Won");
				flag = false;
			}
			
		}while(flag);
		
		
		
		///// 2.WAY /////
		
		do {
			System.out.println("Please enter a number:");
			int num1=scan.nextInt();
			if(num1%5==0) {
				System.out.println("You Won");
				break;
			}	
		}while(true);
		
		
		/*
		 QUESTİON 6 
		 ask user to enter a name,
		 if the name contains the letter 'a' then print "Won" onthe console,
		 otherwise ask user to enter another name.
		 use do-while loop.
		 */
		
		
		
		int idx = 0;
		do {
			
			System.out.println("Please enter a name:");
			String name = scan.next();
			idx++;
			if(name.contains("a")) {
				System.out.println("You won");
				break;
			}
			
		}while(true);
		
		/*
		 QUESTİON 7 
		 ask user to enter a String,
		 print the characters whose indexes are odd on the console,
		 for example: Germany ====> e m n
		 */
		
		System.out.println("Please enter a string:");
		String str = scan.next();
		int idx1 = 0;
		
		do {
			if(idx1%2!=0) {
				System.out.print(str.charAt(idx1));
			}
			
			idx1++;
		}while(idx1<str.length());
		
		
		
		
	}

}
