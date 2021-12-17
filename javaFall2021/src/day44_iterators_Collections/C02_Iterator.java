package day44_iterators_Collections;

import java.util.Iterator;
import java.util.List;



public class C02_Iterator {

	public static void main(String[] args) {


		List<Integer> liste = List.of(5,3,7,1,9,8,2);
		
		System.out.println(liste); // [5, 3, 7, 1, 9, 8, 2]

		
		Iterator ite1 = liste.iterator();
		
		
		for (int i = 0; i < liste.size(); i++) {
			
			System.out.println(ite1.hasNext()+ "====" +ite1.next());
			
		}
		
		System.out.println(ite1.hasNext()); // false
		System.out.println(ite1.next()); // java.util.NoSuchElementException
		
		
		
	}

}
