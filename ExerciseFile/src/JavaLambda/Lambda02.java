package JavaLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Lambda02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,-5,4));

		
		ciftKareMax(list);
		toplaEl1(list);
		toplaEl2(list);
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

		
		
//		List'in cift olan elemanlarının karelerini alınız ve en büyüğünü yazdırınız.

	}
	public static void ciftKareMax(List<Integer> list) {
		
		Optional<Integer> max = list.stream().filter(t->t%2==0).map(t->t*t).reduce(Integer :: max);
		
		System.out.println(max);
		
	}
	
//	List'teki tüm elemanların toplamını yazdırınız. Lambda expression ile;
	
	public static void toplaEl1(List<Integer> list) {
		//long toplam = list.stream().count(); 1. yol
		
		//Integer toplam=list.stream().reduce(0, (x,y)->(x+y)); 2. yol
		// System.out.println(toplam);
		
		System.out.println(list.stream().reduce(Integer::sum)); // 3. yol
		
		
		

	}
	
	
	
//	TASK 3 = LİST'teki tüm elemanların toplamını yazdırınız method referans ile.
	public static void toplaEl2(List<Integer> list) {
		
		System.out.println(list.stream().reduce(0, (x,y)->(x+y)));
	
	}
	
//		TASK 4 = List'teki çift elemanların çarpımını yazdırınız Method referans ile;
	public static void carpCiftEl1(List<Integer> list) {
		
		Optional<Integer> carp = list.stream().filter(t-> t%2==0).reduce(Math :: multiplyExact);
		
		System.out.println(carp);
	
	}

	//	TASK 4 = List'teki çift elemanların çarpımını yazdırınız Lambda expressionile;
			public static void carpCiftEl2(List<Integer> list) {
				
				System.out.println(list.stream().filter(t->t%2==0).reduce(1, (x,y)-> (x*y)));
				
			
			
			}


			
			
//			TASK 5= list'teki elemanlardan en küçüğünü 4 farklı yöntem ile yazdırınız.

			//			1. yöntem method referans ile Integer class'ından 
			
			public static void min1(List<Integer> list) {
				System.out.println(list.stream().reduce(Integer::min));
				
				
			}
			
			//			2. yöntem method referans ile Math clasından

			public static void min2(List<Integer> list) {
				System.out.println(list.stream().reduce(Math::min));
				
				
			}
			
			
//						3. yöntem method referans ile Haluk clasından
			
			public static int minBul(int x, int y) {
				
				return x>y?y:x;							
			}
			
			
			public static void min3(List<Integer> list) {
				System.out.println(list.stream().reduce(Lambda02::minBul));
			}
			
			
			
//						4. yöntem lambda expression ile ;
			
			public static void min4(List<Integer> list) {
				System.out.println(list.stream().reduce(Integer.MAX_VALUE, (x,y)->(x<y?x:y)));
				
				
			}
			
//			TASK 6: List'teki 2'den büyük en küçük tek sayıyı yazdırınız:
			
			public static void onbestenBykKckTekSayi(List<Integer> list) {
				//System.out.println(list.stream().filter(t->t>2 && t%2==1).reduce(Integer.MAX_VALUE, (x,y)-> x<y?x:y)); 1. yol 
				//System.out.println(list.stream().filter(t->t>2 && t%2==1).reduce(Math :: min));    // 2. YOL
				System.out.println(list.
						stream().
						filter(t->t>2 && t%2==1).
						reduce(Integer :: min));    // 3. YOL			
			}
			
			
//			TASK 7: list'in çift elemanlarının karelerini küçükten  büyüğe  yazdırınız.
			
			public static void ciftKareKckByk(List<Integer> list) {
				list.stream().filter(t->t%2==0).map(t->t*t).sorted().forEach(t->System.out.print(t + " "));		
			
			}
			
//			TASK 8 list'in tek elemanlarını büyükten küçüğü doğru sıralayın;
			
			public static void tekKareBykKck(List<Integer> list) {
				
			//list.stream().filter(t->t%2==1).sorted(Comparator.reverseOrder()).forEach(System.out::print);
			list.stream().filter(t->t%2==1 || t%2==-1).sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t + " "));

						
	}

}
