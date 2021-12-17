package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {


		List<String> isimler = new ArrayList<>();
		System.out.println("Boş Liste : " + isimler);
		
		
		isimler.add("Ali");
		System.out.println("Bir eleman: " + isimler);
		
		
		isimler.add("Veli");
		System.out.println("İki eleman: " + isimler);
		//add methodu listenin sonuna ekleme yapar. !!!!!!

		
		isimler.add("Can");
		System.out.println("Üç eleman : " + isimler);

		
		isimler.add(1, "Ayşe"); // bir numaralı indekse "Ayşe" ekle.
		System.out.println("dört eleman: " + isimler);
		
		
		// isimler.add(5) declare ederken belirttiğimiz bir data türü dışında bir data
		// türünden ekleme yapamayız.
		
		
		List<String> liste2 = new ArrayList<>();
		liste2.add("Günter");
		liste2.add("Emrah");
		System.out.println("liste iki:  " + liste2);
		
		isimler.addAll(2, liste2);
		System.out.println("ikinci indeksten sonra liste2 eklendi: " + isimler);		
		isimler.addAll(4, liste2);
		System.out.println("sona liste2'yi ekledik: " + isimler);
		isimler.addAll(liste2);
		System.out.println("sona liste2'yi ekledi birleşik liste : " + isimler);
		isimler.addAll(0, liste2);
		System.out.println("birleşik liste" + isimler);
		
		


		

		
		
	}

}
