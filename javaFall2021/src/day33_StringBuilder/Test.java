package day33_StringBuilder;

public class Test {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.append("aaa").insert(1, "bb").insert(4, "ccc"));
		
		
		///////////////// SORU2 ////////////////
		
		
		
		String s1 = "Java";
		StringBuilder s2 = new StringBuilder("Java");
		
		if (s1!=s2.toString()) {
			System.out.println("1");
			
		} if(s1.equals(s2.toString())) {
			System.out.println("2");
		}
		
		
		
		
		///////////////// SORU4 ////////////////

		
		int total =0;
		StringBuilder letters = new StringBuilder("abcdefg");
		
		total += letters.substring(1,2).length();
		total += letters.substring(6,6).length();
		total += letters.substring(6,5).length();
		
		System.out.println(total);
		
	}

}
