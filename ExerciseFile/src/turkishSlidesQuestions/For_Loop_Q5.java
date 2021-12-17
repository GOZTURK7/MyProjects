package turkishSlidesQuestions;

import java.util.Scanner;

public class For_Loop_Q5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		
		/*
		 Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		 1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
		 */
		
		
		System.out.println("100'den küçük bir tam sayı giriniz:");
		int num = scan.nextInt();
		
		for (int i=1; i<=num; i++) {
			if(i%3==0 || i%5==0) {
				System.out.print(i+", ");
			}
		}
		
	}

}
