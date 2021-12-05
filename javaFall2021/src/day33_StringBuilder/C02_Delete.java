package day33_StringBuilder;

public class C02_Delete {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder("Java candir can");
		
		sb.deleteCharAt(11); // sadece 11. index'teki karakteri siler
		
		
		System.out.println(sb); // Java candircan

		
		
		sb.delete(11, sb.length());
		
		System.out.println(sb); // Java candir
		
		
		sb.delete(5, 90);
		
		System.out.println(sb); // Java
		
		
		
		// 
		
		
		
		
		
		

	}

}
