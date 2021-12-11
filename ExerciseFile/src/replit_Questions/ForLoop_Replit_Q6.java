package replit_Questions;

public class ForLoop_Replit_Q6 {

	public static void main(String[] args) {

		/*
		 SORU6:
			Konsolda Alfabeyi Yazdıran programi yaziniz.
			OUTPUT :
			a b c .. .. .. .. y z

		 */
		
		for(char c = 'a'; c <='z'; c++) {
			System.out.print(c + " " );
		}
		
		
		///////////// KOD SONU //////////////////
		
		System.out.println();
		
		///////////// WHİLE LOOP İLE ////////////////

		char c='a';
		
		while(c<='z') {
			System.out.print(c + " ");
			c++;
		}
	}

}
