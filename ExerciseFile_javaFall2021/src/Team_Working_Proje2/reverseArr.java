package Team_Working_Proje2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reverseArr {

	/*
	 * Given String array
	 * 
	 * reverse the String array
	 * 
	 * print the reversed array
	 * 
	 * NOTE: While printing the array dont use for loop Use
	 * Arrays.toString(your_array_name);
	 * 
	 * 
	 */

	/*
	 * 
	 * Verilen String array
	 * 
	 * tring arrayi ters çevir
	 * 
	 * ters arrayi yazdır
	 * 
	 * NOT: Arrays.toString(your_array_name); <--- kullanın
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String myStr = scan.nextLine();

		String[] useThisArray = myStr.split(" ");

		// code start here

		// Koda burdan başlayın

		
		System.out.println("useThisArray: "+Arrays.toString(useThisArray));
		
		
		List<String> reverse = new ArrayList<>();
		
		for (int i = useThisArray.length-1; i >= 0 ; i--) {
			
			reverse.add(useThisArray[i]);
			
			
		}System.out.println("reversed: " + reverse);
		
		
		
		
		
	}
}
