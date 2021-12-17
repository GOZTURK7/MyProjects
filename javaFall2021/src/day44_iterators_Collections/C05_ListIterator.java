package day44_iterators_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	public static void main(String[] args) {


		List<String> liste = new ArrayList<>();
		
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ayşe");
		liste.add("Fatma");
		liste.add("Emrah");
		
		System.out.println(liste); // [Ali, Veli, Ayşe, Fatma, Emrah]

		ListIterator li1 = liste.listIterator();
		String temp ="";
		
		while(li1.hasNext()) {
			
			temp = (String) li1.next();
			li1.set(temp + "X");
		}
		
		System.out.println(liste); //[AliX, VeliX, AyşeX, FatmaX, EmrahX]

		
		
		
		
		
		
		
		
	}

}
