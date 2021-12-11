package RandomExercises;

import java.util.Scanner;

public class ExerciseScratch_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen birinci karakteri giriniz: ");
		char char1 = scan.next().charAt(0);
		
		System.out.println("Lütfen ikinci karakteri giriniz: ");
		char char2 = scan.next().charAt(0);
		
		System.out.println("Lütfen üçüncü karakteri giriniz: ");
		char char3 = scan.next().charAt(0);
		
		System.out.println("Lütfen dördüncü karakteri giriniz: ");
		char char4 = scan.next().charAt(0);


		System.out.println("    "+char1+"    "+char2+"    "+char3+"     "+char3+"     "+char4);
		System.out.println("    "+char1+"   "+char2+" "+char2+"    "+char3+"   "+char3+"     "+char4+" "+char4);
		System.out.println(char1+"   "+char1+"  "+char2+char2+char2+char2+char2+"    "+char3+" "+char3+"     "+char4+char4+char4+char4+char4);
		System.out.println(" "+char1+" "+char1+"  "+char2+"     "+char2+"    "+char3+"     "+char4+"     "+char4);
		
	
		scan.close();
		
				
		
		
	}

}
