package RandomExercises;

import java.util.Scanner;

public class ExerciseScratch_6 {

	public static void main(String[] args) {
		
		
		// Ask user to enter any day name , then print if it is "weekday" or "weekend" day
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name : ");
		String dayName = scan.next();
		
		if(dayName.equalsIgnoreCase("Monday") 
				|| dayName.equalsIgnoreCase("Tuesday")
				|| dayName.equalsIgnoreCase("Wednesday")
				|| dayName.equalsIgnoreCase("Thursday")
				|| dayName.equalsIgnoreCase("Friday")) { // in java to check strigng equality between Strings have two options 1) == , 2) equals()
			System.out.println("Weekday");
		}
		
		if(dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) {
			System.out.println("Weekend");
		}
		scan.close();
			
	}

}
