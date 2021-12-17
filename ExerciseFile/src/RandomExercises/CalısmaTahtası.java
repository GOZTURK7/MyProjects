package RandomExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CalısmaTahtası {

	public static void main(String[] args) {


		
		List<String> list1 = new ArrayList<>(Arrays.asList("A","C","E","F"));
		
		List<String> list2 = new ArrayList<>(List.of("A","C","E","F"));

		list1.add("B");
		
		list1.add(1, "L");
		
		list2.add(1, "L");
		
		list2.add("B");
		
		System.out.println(list1);
		
		System.out.println(list2);
		
		System.out.println(list1.remove(0));
		
		System.out.println(list2.remove(0));
		
		System.out.println(list1);
		
		System.out.println(list2);	
		
		System.out.println(list1.set(2, "D"));
		
		System.out.println(list2.set(2, "D"));
		
		System.out.println(list1);
		
		System.out.println(list2);	
		
		System.out.println(list1.remove(3));
		
		System.out.println(list2.remove(3));
		
		System.out.println(list1);
		
		System.out.println(list2);
		
		Collections.sort(list1);
		
		Collections.sort(list2);
		
		System.out.println("List1: " + list1 + " List2: "+ list2);
		
		System.out.println(list1.contains("D"));
		
		System.out.println(list2.contains("F"));
		
		Object [] arr = list1.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		String [] arr2 = list2.toArray(new String [list2.size()]);
		
		System.out.println(Arrays.toString(arr2));
		

		
		
	}

}
