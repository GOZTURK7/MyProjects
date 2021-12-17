package recrusive_Methods;

public class strCount {

	public static void main(String[] args) {

		/* Given a string and a non-empty substring sub, 
		 * compute recursively the number of times that sub appears in the string, 
		 * without the sub strings overlapping.	
		 * 	
			strCount("catcowcat", "cat") → 2
			strCount("catcowcat", "cow") → 1
			strCount("catcowcat", "dog") → 0
		 * 
		 */
		
		String str = "catcowcat";
		String subStr="dog";
		
		
		strCount(str, subStr);
		System.out.println(strCount(str, subStr));
		
		
	}

	private static int strCount(String str, String subStr) {

		int counter = 0;
		
		if(str.length()<3) return 0;
		
		if(str.substring(0,3).equals(subStr)) return 1 + strCount(str.substring(3), subStr);
			
			
		
		return strCount(str.substring(1), subStr);
	}

}
