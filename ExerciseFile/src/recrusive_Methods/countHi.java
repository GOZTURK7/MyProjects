package recrusive_Methods;

public class countHi {

	public static void main(String[] args) {


		/* Given a string, compute recursively the number of times lowercase "hi" appears in the string, 
		 * however do not count "hi" that have an 'x' immedately before them.
				
				countHi2("ahixhi") → 1
				countHi2("ahibhi") → 2
				countHi2("xhixhi") → 0
				
		 * 
		 */
		
		String str = "ahibhi";
		
		System.out.println(countHi(str));
		
	}

	private static int countHi(String str) {
		
		
		int counter=0;
		
		if(str.length()<3) return 0;

		if(str.substring(1,3).contains("hi") && !str.substring(0,1).equals("x"))
			counter++;
		
		return counter + countHi(str.substring(1));
	}

}
