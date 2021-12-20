package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {

		Deque<String> ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		
		System.out.println(ciftBasli); // [Yildiz, Ali] add() Queue'dan geldiğinden sona ekler
		
		ciftBasli.addLast("Emine"); // Deque'dan gelen özellik. sona ekliyor belki daha hızlı çünkü deque'den geliyor öteki Queue'dan
		
		
		System.out.println(ciftBasli.getFirst());
		
		ciftBasli.offer("Gökhan");
		
		System.out.println(ciftBasli);
		
		System.out.println(ciftBasli.pop()); // Yildiz (ilk elementi silip döndürüyor)

		System.out.println(ciftBasli); // [Ali, Emine, Gökhan] yeni liste pop()'dan sonra.
		
		ciftBasli.push("Ali");

		System.out.println(ciftBasli); //[Ali, Ali, Emine, Gökhan]

		ciftBasli.add(null);
		
		System.out.println(ciftBasli);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
