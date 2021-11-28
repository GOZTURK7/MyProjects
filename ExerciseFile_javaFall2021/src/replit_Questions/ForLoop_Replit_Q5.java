package replit_Questions;

public class ForLoop_Replit_Q5 {

	public static void main(String[] args) {


		/*
		 SORU5:
			100'den 0'a kadar çift sayıları yazdırın, 
			ancak decrement(i--) kullanmayın.
			OUTPUT : 100 98 96 94 92 … … … … 2 0
		 */
		
		for (int i = 100; i >=0; i-=2) {
			System.out.print(i+" ");
		}
		
	}

}
