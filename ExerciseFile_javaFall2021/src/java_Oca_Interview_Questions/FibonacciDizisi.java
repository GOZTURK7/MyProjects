package java_Oca_Interview_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciDizisi {

	public static void main(String[] args) {


		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int num = scan.nextInt();
		
		List<Integer> fibonacci = new ArrayList<>();
		
		int toplam=0;
		
		for (int i = 1; i < num; i++) {
			
			for (int j = 0; j < i; j++) {
				toplam+=j;
			}
			fibonacci.add(toplam);
			toplam=0;
			
			
			
		}System.out.println("Fibonacci: "+fibonacci);

		
		
		
	}

}
