package day29_staticBlocks_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_PassByValue {

	public static void main(String[] args) {


		
		int num[] = {10, 11, 12};
		degistirArray(num);
		System.out.println("Method'dan sonra main method'un içinde array: "+ Arrays.toString(num));
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		degistirList(list);
		System.out.println("Method'dan sonra main method'un içinde list: "+ list);
		
		
	}

	private static void degistirList(List<Integer> list) {


		//list = new ArrayList<>();
		list.add(40);
		System.out.println("list methods : "+ list);
	}

	private static void degistirArray(int[] num) {

		num = new int[5];
		System.out.println("array methods: " + Arrays.toString(num));

		
	}

}
