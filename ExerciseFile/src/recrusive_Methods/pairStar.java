package recrusive_Methods;

public class pairStar {

	public static void main(String[] args) {
		

		/* Given a string, compute recursively a new string where identical chars 
		 * that are adjacent in the original string are separated from each other by a "*".	
		 * 
			pairStar("hello") → "hel*lo"
			pairStar("xxyy") → "x*xy*y"
			pairStar("aaaa") → "a*a*a*a"
					 * 
		 */

		String str = "hello";
		
		//pairStar(str);
		System.out.println(pairStar(str));
		
		
	}

	private static String pairStar(String str) {
		
//		
//		if (str.equals("") || str.length() == 1) return str;
//
//		  if (str.charAt(0) == str.charAt(1))
//	
//		    return str.charAt(0) + "*" + pairStar(str.substring(1));
//		  else
//		    return str.charAt(0) + pairStar(str.substring(1));
//
//		
		
			
//			
//			if (str.length()<2)
//				return str;
//
//				String result = str.substring(0,1);
//				if (str.charAt(0) == str.charAt(1))
//				result += "*";
//
//				return result + pairStar(str.substring(1));
		
		
		if(str.length()<2) return str;
		
		String result = str.substring(0,1);
		
		if(str.charAt(0) == str.charAt(1)) result = result + "*";
		
		return result + pairStar(str.substring(1));
		
//			
	}


}
