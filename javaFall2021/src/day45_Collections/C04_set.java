package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_set {

	public static void main(String[] args) {

		
		Set<Object> s1 = new HashSet<>();
		
		s1.add(4);
		s1.add(7);
		s1.add(11);
		System.out.println(s1); // [4, 7, 11] eklediğimiz sırayla yazdırdı ama böyle bir zorunluluğu yok set bir küme gibi çünkü
		
		s1.add("Java Candır");
		System.out.println(s1); // [Java Candır, 4, 7, 11] Set'i Integer'dan Object'e çevirince tüm classların babasına, 
		// böyle olunca java her türden elementi listeye ekler ama bir sürü casting yapmak 
		// zorunda kalır ve data castingin olmayacağı yerler de olabilir ve yönetmesi çok zor olur bu teknik
		// olarak mümkün ama tavsiye edilmez işlem yapmak çok zorlaşır.

		
		
		List<Object> liste = new ArrayList<>();
		liste.add(5);
		liste.add("Java Super");
		liste.add(true);
		liste.add('x');
		liste.add(s1);
		
		System.out.println(liste); //[5, Java Super, true, x, [Java Candır, 4, 7, 11]]

		
		
		
		
	}

}
