package englishSlidesQuestions;

public class ForLoop_001 {

	public static void main(String[] args) {

		/*
		 sum a given integer number of digits
		 */
		
		int num = 12345;
		int sumDigits = 0;
		
		for (int i =num; i > 0 ; i/=10) {
			
			sumDigits = sumDigits + i%10;
			
		}
		System.out.println(sumDigits);

		
	}

}
