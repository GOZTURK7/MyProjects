package turkishSlidesQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets_Q2 {

	public static void main(String[] args) {
		Set<Integer> tree = new TreeSet<>();
		
		for (int i = 0; i < 100; i++) {
			tree.add(i);
		}
		
		Long time1 = System.currentTimeMillis();
		System.out.println(time1);
		
		Set<Integer> hashset = new HashSet<>();
		
		for (int i = 0; i < 100; i++) {
			hashset.add(i);		
		}
		
		Long time2 = System.currentTimeMillis();
		System.out.println(time2);
		
		System.out.println("fark " + (time2-time1)+ " Mili Saniye");
		
		
		
		
		
		
		
	}

}
