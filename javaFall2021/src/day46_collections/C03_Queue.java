package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {


		// Queue'DA GELEN SONA GELİR İLK GİREN İLK ÇIKAR 
		
		
		
		
		
		Queue<String> kuyruk = new LinkedList<>();
		
		kuyruk.add("Lütfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk); // [Lütfullah, Mustafa, Ridvan]

		
		kuyruk.remove(); // kuyruk olduğu için ilk değeri çıkarıyor.
		
		System.out.println(kuyruk); // [Mustafa, Ridvan] FIFO
		
		kuyruk.remove();
		
		System.out.println(kuyruk); //[Ridvan] FIFO (FİRST İN FİRST OUT)
		
		kuyruk.add("Ridvan");
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		
		System.out.println(kuyruk); // [Ridvan, Ridvan, null, null, null] Queue Set gibi değil aynı elemanı ekleyebiliyoruz istediğimiz kadar.


		
		
	}

}
