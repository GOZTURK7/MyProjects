package day13_stringManupulations;

public class HomeWorkStringManupulation2 {

	public static void main(String[] args) {

		
		
		// soru2	String str1 = "$13.99"	ve  String str2 = "$10.55"	
		//seklinde verilen fiyatlarin toplamini bulunuz.
		
		
		
		String str1 = "$13.99";
		String str2 = "$10.55";
		
		String str1Formatted = str1.replaceAll("\\D", "");
		String str2Formatted = str2.replaceAll("\\D", "");
		
		System.out.println("str1: " + str1Formatted + " + " + "str2:  "+ str2Formatted
				+ "= "+ (Integer.valueOf(str1Formatted) + Integer.valueOf(str2Formatted)));
		

		
		
		
	}
}
