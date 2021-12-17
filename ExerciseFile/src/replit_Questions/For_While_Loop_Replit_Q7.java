package replit_Questions;

import java.util.Scanner;

public class For_While_Loop_Replit_Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
		 herhangi bir sayı Mükemmel Sayı olarak bilinir.
		Input :
		6
		Output:
		6 Mukemmel Sayidir.
		======================
		Input
		7
		Output:
		7 Mukemmel Sayidir degildir.


		 */

		System.out.println("Lütfen bir sayı girin");
		int num = scan.nextInt();
		int numIlk=num;
		int sumFactors = 0;
		for (int i = 1; i < numIlk; i++) {
			if(num%i==0) {
				num/=i;
				sumFactors+=i;
			}
		}
		if(numIlk==sumFactors) {
			System.out.println(numIlk + " Mükemmel Sayı.");
		}else {
			System.out.println(numIlk + " Mükemmel sayı değildir.");
		}
		scan.close();
		
		
	
		
	}

}
