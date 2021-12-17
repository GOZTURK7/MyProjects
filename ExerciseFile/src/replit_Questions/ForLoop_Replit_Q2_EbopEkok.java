package replit_Questions;

import java.util.Scanner;

public class ForLoop_Replit_Q2_EbopEkok {

	public static void main(String[] args) {
		/*SORU2:
			Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
			Input :
			30 and 40
			Expected OutPut:
			GCD for 30 and 40 = 10
			LCM for 30 and 40 = 120
			*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen iki tam sayı girin");
		int num1= scan.nextInt();
		int num2=scan.nextInt();
		int num = 0;
		
		int gdc=1;
		int lcm=1;
		int carpım=(num1*num2);
		
		if(num1 < num2) {
			num=num1;
		}else {
			num=num2;
		}
		
		for(int i=2; i<num; i++) {
			if(num1 % i == 0 && num2 % i ==0) {
				num1 = num1/i;
				num2 = num2/i;
				gdc=gdc*i;
				
			}
		}System.out.println("obeb: " + gdc + " okek: " + (carpım/gdc));

		scan.close();
	}

}
