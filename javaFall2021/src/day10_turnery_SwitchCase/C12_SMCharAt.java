package day10_turnery_SwitchCase;

public class C12_SMCharAt {

	public static void main(String[] args) {

		// charAt (İstenenIndex) method'u istediğimiz indeksdeki karakteri bize verir.
		
		String kurs = "TechProEducation";
		
		System.out.println(kurs.charAt(5)); // r 
		// index "0" dan başlar.
		System.out.println(kurs.charAt(0)); // T

		System.out.println(kurs.charAt(15)); // n
		
		System.out.println(kurs.charAt(16)); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 16 


		
		
		
	}

}
