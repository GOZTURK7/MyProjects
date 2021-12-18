package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {


		List<Integer> ll = new LinkedList<>();
		
		ll.add(5);
		ll.add(7);

		System.out.println(ll);
		
		
		ll.add(9); // DATA TÜRÜNÜ LİST İNTERFACE'İ SEÇTİĞİMİZ İÇİN SADECE LİST'TEKİ METHODLARI KULLANABİLİRİZ.
					// İNTERFACE OLMASINA RAĞMEN LİST METHODLARINI LinkedList Class'ında override ettiğimiz için
					// List interface olmasına rağmen List Methodlarını kullanabildik .
		
		
		Queue<Integer> ll2 = new LinkedList<>();
		
		ll2.add(5);
		ll2.add(7);
		ll2.clear(); // DATA türü Queue seçilince Queue İnterface'ında gelen methodları kullanabildik.
		
		
		Deque<Integer> ll3 = new LinkedList<>();
		
		ll3.add(5);
		ll3.add(7);
		ll3.addLast(20); // 
	}

}
