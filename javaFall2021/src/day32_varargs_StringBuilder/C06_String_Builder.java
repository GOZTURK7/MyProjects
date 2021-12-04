package day32_varargs_StringBuilder;

public class C06_String_Builder {

	public static void main(String[] args) {


		String str = "Ali Can";
		
		String str2= new String("Veli Cem");
		
		
		StringBuilder sb = new StringBuilder("Yasasin Java");
		
		sb.append("!!!");
		
		System.out.println(sb); 
		
		sb.toString().toUpperCase();
		
		System.out.println(sb); 
		
		
	}

}
