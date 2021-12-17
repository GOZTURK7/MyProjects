package replit_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Varargs {
	
	
	/*VARARGS Soru 1:
		Write a return method that accepts more than one integer as parameter and prints the sum of integers
		Method name = sum if you call method like that sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
	 * 
	 */
	
	

	public static void main(String[] args) {

		System.out.println(sum(1,2,3,4,5));
		

	}

	private static int sum(int ...num) {
	
		
		int result = 0;
		for (int i : num) {
			result+=i;
		}
		
		return result;
		

		
		
	}

}
