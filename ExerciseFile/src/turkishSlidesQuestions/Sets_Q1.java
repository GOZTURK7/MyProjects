package turkishSlidesQuestions;

import java.util.HashSet;
import java.util.Set;

public class Sets_Q1 {

	public static void main(String[] args) {


		// Verilen bir arraydeki tekrarlı elemanları silip, sadece unique değerlerden oluşan bir liste
		// haline getiren bir program yazınız.
		
		int arr [] = {1,2,3,4,5,6,2,2,4,5,6};
		
		Set<Integer> set = new HashSet<>();
		
		for (Integer integer : arr) {
			
			set.add(integer);
			
		}
		
		System.out.println(set);
		
		
		///////////////// soru bitti deneme yaptım aşağıda //////////////////
		
		
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(90);
		set1.add(98);
		
		
		set1.addAll(set);
		System.out.println(set);
		System.out.println(set1);
		System.out.println(set1.containsAll(set)); // set'in tüm elemanları set1'de olduğu için true döndü.
		
		
		
		
		
		set1.removeAll(set); // set1'in içindeki set collection'unun tüm elemanlarını sil
		System.out.println(set1); // [98, 90]

		
		
		
		
		set1.addAll(set);
		set.add(3);
		set.add(999);
		System.out.println(set);
		System.out.println(set1);
		set1.removeAll(set); // set'te olup set1'de de olanları siliyor diğerlerini ellemiyor
		System.out.println(set1);
		
		
		
	}

}
