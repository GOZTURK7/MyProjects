package replit_Questions;

public class Method_Array_Q1_SayıyıTerstenYazdır {

	public static void main(String[] args) {

		/*
		 * Soru1:
			Write a return method to reverse number.
			Input : 12345
			Output : 54321
		 */
		
		
		int input = 12345;
		
		
		cevir(input);

		
	}

	private static void cevir(int input) {
		String tersSayi= "";
		
		while(input>0) {
			
			tersSayi+=(input%10);
			input/=10;
			
		}
		System.out.println(tersSayi);
		
	}

}
