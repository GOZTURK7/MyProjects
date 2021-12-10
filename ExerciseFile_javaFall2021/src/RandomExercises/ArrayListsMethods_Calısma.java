package RandomExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListsMethods_Calısma {

	public static void main(String[] args) {


		
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		System.out.println("Normal Nums: "+nums+"\n");
	
		
		
		List<String> str = new ArrayList<>(List.of("Ali","Ayşe","Kemal","Mahmut","Recai"));
		System.out.println(str+"\n");
		
		
		Collections.reverse(nums);		
		System.out.println("Reversed Nums: "+nums+"\n");
		
		
		String str1 [] = str.toArray(new String [0]);
		System.out.println(Arrays.toString(str1));
		
		
		List<String> str2 = Arrays.asList(str1);
		System.out.println(str2);
		
		
		List<Integer> nums1 = new ArrayList<>();
		Collections.copy(nums, nums1);
		System.out.println(nums);
		System.out.println(nums1);
		
		
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));


		
		
		
		
		
		
	}

}
