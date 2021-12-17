package RandomExercises;

import java.util.Scanner;

public class Baklava_Deseni {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("tam sayı girin");
		int num=scan.nextInt();
		num+=1;
		
		
		for(int i=1; i<num; i++) {
			
			for(int j=1; j<num-i; j++)
				System.out.print(" ");
			
			for(int k=1; k<=2*i-1; k++)
				System.out.print("X");
			
			System.out.println();
		}
		
		for(int i=1; i<num; i++) {
			
			for(int j=num; j<num-(i*2); j--)
				System.out.print(" ");
			
			for(int k=num; k<=2*i+1; k++)
				System.out.print("X");
			
			System.out.println();
		}
		
		
		
		
		
	}

}
