package replit_Questions;

public class For_While_Loop_Replit_Q8 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	/*
	 SORU8:
		'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.
		Ascii value of a = 97 Ascii value of b = 98 Ascii value of c = 99 Ascii value of ...
	 */
		
		
		int counter = 0;
		
		for (char i = 'a'; i <='z'; i++) {
			counter=i;
			//System.out.println("Ascii value of '"+i+"' ="+counter);
		}
		
		
		
		////////////////// WHİLE İLE //////////////
		
		
		
		
		char i1='a';
			
		while(i1>='a' && i1<='z') {
			System.out.println("Ascii value of '"+i1+"'=" + (0+i1));
			i1++;
		}
	}

}
