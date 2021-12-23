package day46_collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Deneme {

	public static void main(String[] args) {


		
		Queue<Integer> que = new PriorityQueue<>();
		
		que.add(1);
		que.add(3);
		que.add(55);
		que.add(4);
		que.add(9);
		
		System.out.println(que);
				
		while(!que.isEmpty()) {
			
			System.out.print(" "+que.poll()); // herhangi bir öncelik vermediğimiz için default olarak doğal sıralı sildi yani ascending order'a göre
		}
		
		
		
		
	}

}
