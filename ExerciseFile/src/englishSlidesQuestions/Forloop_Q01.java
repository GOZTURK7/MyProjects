package englishSlidesQuestions;

public class Forloop_Q01 {

	public static void main(String[] args) {

		/*
		 Type code to print a string in reverse after remowing spaces
		 example: AliCan ===> naCilA
		 */
		
		
		String s2 = "Ali Can";
		String reverse= "";
		
		for (int i=s2.length()-1; i >=0; i--) {
			char c = s2.charAt(i);
			if (c != ' ')
				reverse+=c;
			}
			
			System.out.println(reverse);


	}

}
