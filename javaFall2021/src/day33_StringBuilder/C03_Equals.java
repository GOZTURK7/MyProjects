package day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		//StringBuilder' da equals() methodu stringdeki mantıkla çalışmaz, == mantığı ile çalışır.
		
		System.out.println(sb1.compareTo(sb2)); // 0
		
		
		
		
		
		
		String str = "Java";
		
		//System.out.println(sb1==str); == sb ile stringi karşılaştıramaz Incompatible operand types StringBuilder and String
		System.out.println(sb1.equals(str)); // false
		//System.out.println(sb1.compareTo(str)); compare string için kullanılamaz.
		
		//System.out.println(sb1=="Java"); // Incompatible operand types StringBuilder and String
		System.out.println(sb1.equals("Java")); // false
		

		
		
	}

}
