package turkishSlidesQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators_Q5 {

	public static void main(String[] args) {


//		Iterator ile index kullanımına örnek , bir listedeki ilk n elemani iterator kullanark 5 artırın
		
		
		
		
		List<Integer> liste = new ArrayList<>(); //List.of(2,13,56,23,45,14,40);
		
		liste.add(2);
		liste.add(13);
		liste.add(56);
		liste.add(23);
		liste.add(45);
		liste.add(14);
		liste.add(40);

		
		ListIterator<Integer> itr = liste.listIterator();
		
		
		
		
		
		while(itr.nextIndex()<3) {
			
			liste.set(itr.nextIndex(), (liste.get(itr.nextIndex())+5));
			itr.next();
		}
		
		
		System.out.println(liste);
		
		
		
		
	}

}
