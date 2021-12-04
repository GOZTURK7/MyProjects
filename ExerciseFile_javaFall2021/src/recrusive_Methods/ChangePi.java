package recrusive_Methods;

public class ChangePi {

	public static void main(String[] args) {
		
		
		/* Given a string, compute recursively (no loops) a new string 
		 * where all appearances of "pi" have been replaced by "3.14".

			
			changePi("xpix") → "x3.14x"
			changePi("pipi") → "3.143.14"
			changePi("pip") → "3.14p"

		 * 
		 */
		
		String str="pip";
		
		
		System.out.println(changePi(str)); 
		
	}

	private static String changePi(String str) {

		if(!str.contains("pi")) return str;
		
		if(str.contains("pi")) 
		str=str.replace("pi", "3.14");	
		

		return changePi(str);
	}

}
