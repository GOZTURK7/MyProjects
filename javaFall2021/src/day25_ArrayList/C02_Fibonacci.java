package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {

		
		// Binden küçük fibonacci sayılarını bir list olarak kaydedin.
		
		int sınır = 90;
		
		List<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);

		int sayi=0;
		while(sayi<sınır) {
	
			
		sayi=fibonacci.get(fibonacci.size()-1) + fibonacci.get(fibonacci.size()-2);
		
		if(sayi<100) {
			fibonacci.add(sayi);	
		}

		}System.out.println(fibonacci);
		
		
		
		
		
		
		
	}

}
