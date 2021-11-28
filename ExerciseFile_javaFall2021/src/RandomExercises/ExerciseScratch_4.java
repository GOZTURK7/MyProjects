package RandomExercises;

import java.util.Scanner;

public class ExerciseScratch_4 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);

	System.out.println("Lütfen a sayısını girin;");
	int a = scan.nextInt();
	System.out.println("Lütfen b sayısını girin;");
	int b = scan.nextInt();
	System.out.println("a : "+a +" ve b : " + b);
	
	int emptyBox; 
	
	emptyBox=b;
	b = a;
	a=emptyBox;
	System.out.println("a : "+a +" ve b : " + b);
	
	
	int x = 5;
	int y= 2;
	
	System.out.println("x : " + x + " y :" + y);

	x = x - y;
	y = x + y;
	x = y - x;
	
	System.out.println("x : " + x + " y :" + y);

	scan.close();
		
	

		
	}

}
