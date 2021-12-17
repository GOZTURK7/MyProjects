package day11_stringManupulations;

public class C01_Equals {

	public static void main(String[] args) {

		
		int a = 10;
		int b = a + 0;
		
		System.out.println(a == b); //  a eşit b mi? True

		
		char ch1 = 'K';
		char ch2 = 'K' + 0;
		
		System.out.println(ch1 == ch2); //  ch1 eşit ch2 mi? True

		
		String str1 = "Ali";
		
		String str2 = "Can";
		String str3 = "Ali Can";
		String str4 = str1 + " " + str2; // Ali Can
		System.out.println(str4); //  Ali Can
		System.out.println(str3 == str4); //  false

		
		// String variable'larda == hem değere hem de referansina bakar
		// dolayısıyla objeler farklı olduğunda genelde false döner
		
		// str.equals(str2) ise referanslara değil SADECE DEĞERE bakar,
		// eğer case sensitive olarak String değerleri aynı ise true döner
		
		
		
		
	}

}
