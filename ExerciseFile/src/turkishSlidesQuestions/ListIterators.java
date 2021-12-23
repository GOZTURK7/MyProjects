package turkishSlidesQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {

	public static void main(String[] args) {

		List<String> liste = new ArrayList<>();
		liste.add("A");
		liste.add("B");
		liste.add("C");
		liste.add("D");

		ListIterator<String> li = liste.listIterator();
		
		while(li.hasNext()) {
			
			String str = li.next();
			li.set(str+"X");
		}
		System.out.println(liste);
		
		
	}

}
