package recrusive_Methods;

public class CountX {

	public static void main(String[] args) {

		/*
		 * Given a string, compute recursively (no loops) the number of lowercase 'x'
		 * chars in the string.
		 * 
		 * 
		 * countX("xxhixx") → 4 countX("xhixhix") → 3 countX("hi") → 0
		 * 
		 */

		String str = "xxhixx";

		System.out.println(countX(str));
	}

	private static int countX(String str) {

		if(str.length()==0) return 0;
		
		int sum = 0;

		if (str.charAt(0) == 'x')  sum=sum+1;
		
		
		return sum + countX(str.substring(1));
		

		
	

		
	}
}
