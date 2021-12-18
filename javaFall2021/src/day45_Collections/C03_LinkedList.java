package day45_Collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList();
		
		System.out.println(ll); // []
		
		ll.add(5);
		ll.add(7);
	
		System.out.println(ll); //[5, 7]
		
		ll.element();
		
		System.out.println(ll.peek()); // silmeden ilk elemanı bana getirir.
		
		System.out.println(ll.peekFirst());// silmeden ilk elemanı bana getirir.
		
		
		
		
		LinkedList<Integer> ll2 = new LinkedList();
		
		System.out.println(ll2.peekFirst()); // null
		
		System.out.println(ll2.peek()); // null
		
		
		
		System.out.println(ll.element()); // 5 ilk elementi döndürüyor.
		//System.out.println(ll2.element()); // java.util.NoSuchElementException


		
		System.out.println(ll.poll()); // 5 döndürür sildiği elemanı döndürür.
		System.out.println(ll); // [7]
		System.out.println(ll.poll()); // 7
		System.out.println(ll.poll()); // null liste artık boşaldığı için.
		System.out.println(ll.hashCode()); // 1 bu listenin hash kodunu döndürüyor.
		
		ll2.add(3);
		System.out.println(ll2.hashCode()); // 34 ll'e eleman ekleyince hash kodu değişti
		
		System.out.println(ll2.offer(10)); // true 10'u gidip ll2'ye ekledi sonra true return etti.
		
		System.out.println(ll2); // [3, 10]
		

		


		
	}

}
