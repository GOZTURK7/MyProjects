package recrusive_Methods;

public class Reverse_String {

	
	public static void main(String[] args) {
		String str = "Freedom For Dream";
		// cevir(str);
		System.out.println(cevir(str));
	}
	public static String cevir(String str) {
		if (str.isEmpty())
			return str;
		System.out.println(str);
		return cevir(str.substring(1)) + str.charAt(0);
		
	}
}

