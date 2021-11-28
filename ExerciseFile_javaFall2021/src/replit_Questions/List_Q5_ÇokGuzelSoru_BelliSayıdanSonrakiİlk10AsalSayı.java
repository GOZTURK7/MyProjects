package replit_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Q5_ÇokGuzelSoru_BelliSayıdanSonrakiİlk10AsalSayı {

	public static void main(String[] args) {

		/*
		 * Soru5: Write a program that accepts an integer as input and prints first 10
		 * prime numbers greater than input Check numbers if they are even or not in a
		 * return method. Input : 5 Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt()+1;

		List<Integer> primeNum = new ArrayList<>();

		while (primeNum.size() < 10) {

			boolean isPrime = true;               // {  bu kısımdan; 
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					num++;
					isPrime = false;
				}
			}
			if (isPrime) {
												// } bu kısıma kadar asal mı değil mi.
				
				primeNum.add(num); // bu kısımda asal ise primeNum listesine ekliyor ve her eklenişte PrimeNum listesinin uzunluğu 
						// doğal olarak artıyor. bu da while içinde check ediliyor daha sonra bulduğumuz prime numberlar
				// girilen num' dan sonraki ilk 10 prime'ın ötesini istemediğimiz için 10 elemandan fazla oldu mu olmadı mı diye check ediyor.
				num++; // bu kısımda num=5 ise 6 için 7 için 8 için ...... primeNum.size() 10 olana kadar tüm numaraları check etmek için.
			}
		}System.out.println(primeNum);
	}

}
