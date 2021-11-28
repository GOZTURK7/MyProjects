package RandomExercises;

import java.util.Scanner;

public class ExerciseScratch_2 {

	public static void main(String[] args) {
		
		
		// a b'nin tam katı mı?
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen a' yı girin: ");
		int a = scan.nextInt();
		
		System.out.print("Lütfen b' yi girin: ");
		int b = scan.nextInt();
		
		if (a % b == 0)
			System.out.println("a b'nin tam katı");
		else 
			System.out.println("a b'nin tam katı değil");

		scan.close();
		
		

		
	}

}
