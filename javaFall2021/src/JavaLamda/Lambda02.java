package JavaLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>(Arrays.asList(12, -3, 65, 3, 7, 34, 22, -60, 42, 55));

//		List'in cift olan elemanlarının karelerini alınız ve en büyüğünü yazdırınız.
		
		ciftKareMax(list);
		toplaEl1(list);
		carpCiftEl1(list);
		carpCiftEl2(list);
		min1(list);
		min2(list);
		min3(list);
		min4(list);
		onbestenBykKckTekSayi(list);
		ciftKareKckByk(list);
		System.out.println();
		tekKareBykKck(list);

		
		
		
	}
	public static void ciftKareMax(List<Integer> list) {
		
		Optional<Integer> maxEl = list.stream().filter(Lambda01 :: ciftBul).map(t -> t*t).reduce(Integer::max);
		 // reduce() returne edilen elelman null yada int 'den buyuk olur ihtimali icin Java guvenlik olarak handle ederek
		   //Optional class' sart kosuyor
		
		//Optional<Integer> maxEl = list.stream().filter(Lambda01 :: ciftBul).map(t -> t*t).reduce(Math::max);
		//reduce(Math::max) da kullanılabilir ancak reduce(Integer::max); daha sepesifik olduğu için daha hızlı
		// çalışır hız büyük datalarda çalışırken önemli.

		System.out.println(maxEl);

		
	}
	
//	List'teki tüm elemanların toplamını yazdırınız. Lambda expression ile;
	
	public static void toplaEl1(List<Integer> list) {
		
		int toplam = list.stream().reduce(0, (x,y) ->(x+y));
		
		/*
		  x  her zaman ilk degerini atanan degerden (0) alır
		  y her zaman degerini list.stream()'den alır(akis)
		  x ilk degerden sonraki degerlerini islemden alir
		 */
		
		System.out.println(toplam);
		//System.out.println(list.stream().reduce(0, (x,y) ->(x+y));
	}
	
	
	
//	TASK 3 = LİST'teki tüm elemanların toplamını yazdırınız method referans ile.
	public static void toplaEl2(List<Integer> list) {
		
		//Optional<Integer> toplam1 = list.stream().reduce(Integer:: sum);
		Optional<Integer> toplam1 = list.stream().reduce(Math:: addExact);


		/*
		  x  her zaman ilk degerini atanan degerden (0) alır
		  y her zaman degerini list.stream()'den alır(akis)
		  x ilk degerden sonraki degerlerini islemden alir
		 */
		
		System.out.println(toplam1);
		//System.out.println(list.stream().reduce(0, (x,y) ->(x+y));
	}
	
//		TASK 4 = List'teki çift elemanların çarpımını yazdırınız Method referans ile;
	public static void carpCiftEl1(List<Integer> list) {
		
		Optional<Integer> carp = list.stream().filter(Lambda01::ciftBul).reduce(Math :: multiplyExact);
		
		System.out.println(carp);
	
	}

	//	TASK 4 = List'teki çift elemanların çarpımını yazdırınız Lambda expressionile;
			public static void carpCiftEl2(List<Integer> list) {
				
				Integer carp = list.stream().filter(Lambda01::ciftBul).reduce(1, (x,y) -> (x*y));
				
				// pozitif değer üretiniz
				Integer carpPoz = list.stream().filter(Lambda01::ciftBul).reduce(-1, (x,y) -> (x*y));

				System.out.println(carpPoz);
			
			}


			
			
//			TASK 5= list'teki elemanlardan en küçüğünü 4 farklı yöntem ile yazdırınız.

			//			1. yöntem method referans ile Integer class'ından 
			
			public static void min1(List<Integer> list) {
				
				Optional<Integer> min1 = list.stream().reduce(Integer :: min);
				System.out.println(min1);
			}
			
			//			2. yöntem method referans ile Math clasından

			public static void min2(List<Integer> list) {
				
				Optional<Integer> min2 = list.stream().reduce(Math :: min);
				System.out.println(min2);
			}
			
			
//						3. yöntem method referans ile Haluk clasından
			
			public static int minBul(int x, int y) {
				
				return (x<y)? (x) : (y);
				
			}
			
			
			public static void min3(List<Integer> list) {
				
				Optional<Integer> min3 = list.stream().reduce(Lambda02 :: minBul);
				System.out.println(min3);
			}
			
			
			
//						4. yöntem lambda expression ile ;
			
			public static void min4(List<Integer> list) {
				
				Integer min4 = list.stream().reduce(Integer.MAX_VALUE, (x,y)->x<y?x:y);
				System.out.println(min4);
			}
			
//			TASK 6: List'teki 15'ten büyük en küçük tek sayıyı yazdırınız:
			
			public static void onbestenBykKckTekSayi(List<Integer> list) {
				
				//list.stream().filter(t -> t%2 == 1).filter(t-> t>15).reduce(Integer::min);
				System.out.println(list.
						stream(). // akışa girdi 
						filter(t -> t%2 == 1 & t>15). // tek ve 15'ten büyük olma şartı sağlandı.
						reduce(Integer::min)); // min değer reduce edildi indirgendi.

				
			}
			
			
//			TASK 7: list'in çift elemanlarının karelerini küçükten  büyüğe  yazdırınız.
			
			public static void ciftKareKckByk(List<Integer> list) {
				
				list.
	            stream().
	            filter(Lambda01::ciftBul).
	            map(t->t*t).
	            sorted().//akısa giren elelmanlar naturel order'e gore siralanir
	            forEach(Lambda01::printEl);//144 484 1156 1764 3600 
			
			}
			
//			TASK 8 list'in tek elemanlarını büyükten küçüğü doğru sıralayın;
			
			public static void tekKareBykKck(List<Integer> list) {
				
				list.
	            stream().
	            filter(t->t%2!=0).
	            map(t->t*t).
	            sorted(Comparator.reverseOrder()).//akısa giren elelmanlar ters sıralanır
	            forEach(Lambda01::printEl);//144 484 1156 1764 3600 
			
			}

			
}
