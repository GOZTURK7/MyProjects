package replit_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Q3_CumleyiTerstenYazdırma {

	public static void main(String[] args) {

		/*
		 * Soru3: Get a sentence from the user. Accept the sentence received from the
		 * user as a parameter, Invert sentence using Array and write a Method that
		 * returns the result as a String to the main method. Note: Upper and lower case
		 * letters, spaces and special characters will not be changed. Input : It is
		 * very nice to write code. Output : .edoc etirw ot ecin yrev si tI
		 */

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		// cevir(input);
		System.out.println(cevir(input));
	}

	private static String cevir(String input) {
		List<String> cumle = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			cumle.add(input.substring(i, i + 1));
		}
		String cumleTers = "";
		for (int i = cumle.size() - 1; i >= 0; i--) {
			cumleTers += cumle.get(i);
		}

		return cumleTers;
	}

}
