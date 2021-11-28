package RandomExercises;

import java.util.Scanner;

public class Baklava_Deseni_For_While {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("tam sayı girin");
		int num=scan.nextInt();
		num+=1;
		
		
		
		for(int i=1; i<num; i++) {
			
			
			for(int j=1; j<num-i; j++) 
				System.out.print(" ");
			
			
			for(int j=1;j<=2*i-1;j++)
				System.out.print("X");
			
			System.out.println();
		}

		
	}

}
