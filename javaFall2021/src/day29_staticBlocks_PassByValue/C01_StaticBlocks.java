package day29_staticBlocks_PassByValue;

public class C01_StaticBlocks {

	
	static {
		
		System.out.println("Static Block ne zaman çalışacak");		
	}
	
	
	public static void main(String[] args) {
		
		
	System.out.println("Javada önce main method çalışır.");
	
	for (String string : args) {
		
	}
		
		
	}
static {
		
		System.out.println("Static Block nereye yazılırsa yazılsın main method'dan bile önce çalışır.");		
	}

	/*
	 * Eğer birden fazla static block varsa java yukarıdakini daha önce çalıştırır.
	 */

}
