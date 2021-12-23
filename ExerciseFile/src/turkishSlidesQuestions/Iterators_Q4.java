package turkishSlidesQuestions;

import java.util.List;
import java.util.ListIterator;

public class Iterators_Q4 {

	public static void main(String[] args) {

			
//			Bir listedeki elementleri iterator kullanarak sondan başa doğru yazdır:
		
		
		List<String> liste = List.of("okulagitmekgüzel".split(""));
		
		ListIterator<String> itr = liste.listIterator();
		
		while(itr.hasNext()) {
			itr.next();	
		}
		
		while(itr.hasPrevious()) {
			String str = itr.previous();
			System.out.print(str);
		}

		
		
		
		
		
	}

}
