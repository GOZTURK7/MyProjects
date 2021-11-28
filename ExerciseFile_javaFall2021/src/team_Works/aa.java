package team_Works;

import java.util.Arrays;

public class aa {

	public static void main(String[] args) {

		int i = 1;
		while (i < 11) {
			if (i == 3 || i == 6 || i == 7) {
				System.out.println("-----> Bu sayı engellendi.");
				i++;
				// continue;
			}
			System.out.println("i = " + i);
			i++;
		}
	}

}
