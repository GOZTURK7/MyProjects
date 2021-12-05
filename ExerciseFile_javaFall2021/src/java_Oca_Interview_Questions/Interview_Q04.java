package java_Oca_Interview_Questions;

public class Interview_Q04 {

	public static void main(String[] args) {

		/*
		 * From a given array find all pairs whose sum is a given number verilen bir
		 * arraydeki, toplamı belirli bir sayı olan tüm çiftleri bulun For example;
		 * input : {4, 6, 5, -10, 8, 5, 20} ==> 10 Output : 4 + 6 = 10, 5 + 5 = 10, -10
		 * + 20 = 10
		 */

		int input[] = { 4, 6, 5, -10, 8, 5, 20 };

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				if (input[i] + input[j] == 10) {

					System.out.print(input[i] + " + " + input[j] + " = 10, ");
				}

			}

		}

	}

}
