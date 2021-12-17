package day36_inheritance;

import day35_encapsulation_Inheritance.Isci;

public class Ustabasi extends Isci {
	
	
	Ustabasi(){
		System.out.println("Ustabaşı parametresiz constructor çalıştı");
	}

	public static void main(String[] args) {

		Ustabasi ust = new Ustabasi();
		
		// Java'da her class oluşturulduğunda otomatik olarak default consturctor oluştuğu gibi
		// Child Class'ta oluşturulan her bir constructor'ın ilk satırında gizli super() constructor
		// oluşturur.
		
		
		
		
	}

}
