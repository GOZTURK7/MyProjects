package recrusive_Methods;

public class CountAbc {

	public static void main(String[] args) {

		/*
		 * Count recursively the total number of "abc" and "aba" substrings that appear
		 * in the given string.
		 * 
		 * countAbc("abc") → 1 countAbc("abcxxabc") → 2 countAbc("abaxxaba") → 2
		 * 
		 * 
		 */

		String str = "ababaxxabcxa";

		System.out.println(countAbc(str));

	}

//	private static int countAbc(String str) {
//
//		int counter = 0;
//		
//		if(!str.contains("abc")) return 0;
//		
//		if(str.contains("abc"))
//			counter++;
//		
//		return counter + countAbc(str.substring(str.indexOf("abc")+1));
//	}

	public static int countAbc(String str) {

		if (str.length() < 3)
			return 0;
		if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))
			return 1 + countAbc(str.substring(1));
		else
			return countAbc(str.substring(1));
	}
}
