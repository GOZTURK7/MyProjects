package recrusive_Methods;

public class BunnyEars {

	public static void main(String[] args) {

		/*
		 * Given a non-negative int n, return the count of the occurrences of 7 as a
		 * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
		 * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
		 * the rightmost digit (126 / 10 is 12).
		 * 
		 * 
		 * count7(717) → 2 count7(7) → 1 count7(123) → 0
		 * 
		 * 
		 */

		int n = 717;

		System.out.println(count7(n));

	}

	private static int count7(int n) {

		int counter = 0;
			
			if (n > 0) {
				
				return count7(n / 10);
			}
		return counter;
			
		
	}

}
