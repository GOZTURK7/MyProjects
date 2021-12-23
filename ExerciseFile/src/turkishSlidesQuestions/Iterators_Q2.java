package turkishSlidesQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators_Q2 {

	public static void main(String[] args) {

		

		
		List<Integer> liste = new ArrayList<>();
		
		liste.add(2);
		liste.add(13);
		liste.add(56);
		liste.add(23);
		liste.add(45);
		liste.add(14);
		liste.add(40);

		ListIterator<Integer> itr = liste.listIterator();
		
		
		while(itr.hasNext()) {
			
			int a = itr.next();
			
			if(a < 20 || a >40) {
				
				itr.remove();
			}
		}
			
		System.out.println(liste);
		
		
		
		
	}

	

}
