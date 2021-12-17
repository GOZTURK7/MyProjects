package day13_stringManupulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {


		String str = "* JAva 98ogrenmek c..ok k876olay";
		
		// replaceAll methodları kullanarak Java ogrenmek cok kolay ile değiştirelim
		
		
		str=str.replaceAll("\\d" , "");
		
		
		
		str=str.replaceAll("\\s" , "x");

		str= str.replaceAll("\\W", "" );
		
		str= str.replace("x", " ");
		
		str= str.replace("JAva", "Java");
		
		System.out.println(str);


	}

}
