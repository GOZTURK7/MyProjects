package day13_stringManupulations;

public class HomeWorkStringManupulation1 {

	public static void main(String[] args) {

		//String metodlarını kullanarak Java ogrenmek123 Cok guzel@ stringini
		// Java ogrenmek cok guzel şekline çevirin.
		
		
		String str = "Java ogrenmek123 Cok guzel@";
		
		str = str.replace('C', 'c');
		System.out.println(str);
		str = str.replace("123", "");
		System.out.println(str);
		str = str.replace("@", "");
		System.out.println(str);

	}

}
