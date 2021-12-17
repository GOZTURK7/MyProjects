package day19_WhileLoop_doWhileLoop;

public class C05_Slide_Q1 {

	public static void main(String[] args) {


		/*
		 m harfinden başlayarak 'c harfine kadar tüm harfleri yazıdırın
		 
		 */
		
		/////////// DO-WHİLE İLE //////////
		
		char c = 'm';
		
		do {
			System.out.print(c + " ");
			
			c--;
		}while(c > 'c');
		
		
		
		///////////// WHİLE İLE /////////////
		System.out.println();
		
		
		
		char c1 = 'm';
		
		while(c1 > 'c') {			
		System.out.print(c1 + " ");
			c1--;
		}
		
		
		//////////// FOR İLE //////////
		System.out.println();
		
		
		
		
		for (char i = 'm'; i > 'c'; i--) {
			System.out.print(i+ " ");
		}

		
		String num= "12345";
		
		
		
		
	}


}
