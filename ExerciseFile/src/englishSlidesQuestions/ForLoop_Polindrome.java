package englishSlidesQuestions;

public class ForLoop_Polindrome {

	public static void main(String[] args) {
		/*
		 Type code to check if a given String is Pallindrome or not.
		 example : anna reversed of anna same so anna is pallindrome
		 */
		
		String s1 = "anna";
		String reverse = "";
		for(int i=s1.length()-1; i>=0; i--) {
			
			char c = s1.charAt(i);
			reverse = reverse + c;
		}if (reverse.equals(s1)) {
			System.out.println(""+reverse+": This is a polindrome.");
		}else {
			System.out.println(""+reverse+": This is not a polindrome.");
		}
		

		
		
		
	}

}
