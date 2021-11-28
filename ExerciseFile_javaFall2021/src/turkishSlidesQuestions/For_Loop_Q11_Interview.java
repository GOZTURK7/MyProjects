package turkishSlidesQuestions;

import java.util.Scanner;

public class For_Loop_Q11_Interview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin 
		 ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		 */
		
		
		System.out.println("Lütfen 10 dan küçük bir sayı giriniz:");
		int num = scan.nextInt();
		
		System.out.print(num + "!=");
		int faktoriyel = 1;
		
		for(int i=num; i>1; i--) {
			faktoriyel*=i;
			System.out.print(i + "*");
			
		}
		System.out.println("1=" + faktoriyel);
		
		
		
	}

}
