package englishSlidesQuestions;

public class ForLoop_Ucgen {

	public static void main(String[] args) {
		
		/*
		 FOR LOOP 
				Video 10 				
				Question 1 : Get the number of rows from user then draw a right triangle by using Asterix￼es
				*
				**
				***
				****
		 */
		
		
		int numOfRows = 10;
		for(int i=1; i<=numOfRows; i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print("* ");

			}System.out.println("");
		
		}

		
	}

}
