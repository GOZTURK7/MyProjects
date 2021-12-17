package day30_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class DoubleEqualTest {

	public static void main(String[] args) {


		String str1 = new String("Mehmet");
		
		String str2 = new String("Mehmet");
		
		System.out.println("new == " + (str1==str2));
		
		
		String str3 = "Mehmet";  
		
		String str4 = "Mehmet";
		
		System.out.println("Klasik == : "+ (str3==str4));
		
		System.out.println("Klasik equals: " + (str3.equals(str4)));
		
		
		
		
		/////////////////////////soru////////
		
		List<Integer> values = new ArrayList<>();
		
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		
		for (Integer s : values) System.out.println(s);
		
		
	}
	

}
