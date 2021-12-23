package turkishSlidesQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets_Q3 {

	public static void main(String[] args) {

		
		Set<Integer> tree = new TreeSet<>();
		
		for (int i = 0; i < 100; i++) {
			tree.add(i);
		}
		
		
		Set<Integer> hashset = new HashSet<>();
		
		hashset.addAll(tree);
		
		System.out.println(hashset);
		
		
		
		
		
		
	}

}
