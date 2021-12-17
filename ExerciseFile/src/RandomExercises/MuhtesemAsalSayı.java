package RandomExercises;

import java.util.ArrayList;
import java.util.List;


public class MuhtesemAsalSayı {

	public static void main(String[] args) {


		/* // 		Muhtesem asal sayi ; asal sayilarin toplamiyla elde edilen asal sayilara denir. 
		//		 	2 den 10000'e kadar olan muhtesem asal sayilari ekrana yazdiriniz.
		// 			orn: 2+3=5	2+3+5+7=17		2+3+5+7+11+13=41	.....
					ekran ciktisi:  5 17 41 197 . . .
		 * 
		 * 			
		 * 			
		 * 
		 */
		
		
		int num = 100;
		
		List<Integer> asalSayılar = new ArrayList<>();
		asalSayılar.add(2);

		
		boolean isPrime = true;
		for (int i = 3; i <num; i++) {
			
			for (int j = 2; j < i; j++) {
				
				if (i%j==0) {
					isPrime=false;
				}else {
					isPrime=true;
				}
				
			}if (isPrime=true) {
				asalSayılar.add(i);
			}
		}
		System.out.println(asalSayılar);
		int toplam = 2;
		for (int i = 1; i <asalSayılar.size(); i++) {
			
			toplam+=asalSayılar.get(i);
			if(asalSayılar.contains(toplam)) {
				System.out.print(toplam+ " ");
			}else {
				toplam-=asalSayılar.get(i);
				continue;
			}
			
			
		}
		
	}

}
