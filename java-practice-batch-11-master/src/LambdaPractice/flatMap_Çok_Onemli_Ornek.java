package LambdaPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class flatMap_Çok_Onemli_Ornek {
    //        3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öğelerini içeren bir Dize listesi oluşturun
//        4) "J" ile baslayin olan öğeleri almayın
//        5) Farklı öğeleri seçin
//        6)Karakter sayısına göre doğal sıraya koyun
//        7) Tüm öğeleri büyük harfe dönüştürün
//        8) Konsoldaki öğeleri yazdırın
//        9)Fonksiyonel Programlama'yı kullanın
//        */

	public static void main(String[] args) {

		
		// BURADA KENDİME BİR DENEME YAPTIM ÇOK ÖNEMLİ OLAN KISIM BURASI !!!!

		List<String> liste = Arrays.asList("Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson");
		List<String> liste1 = Arrays.asList("Ali", "Veli", "Kemal", "Alexander", "Yusuf", "Mehmet", "ibrahim");

		
		Stream.of(liste,liste1).forEach(t->System.out.println(t+", "));
		// [Ali, John, Ali, Alexander, Taylor, Ali, Jackson], 
		// [Ali, Veli, Kemal, Alexander, Yusuf, Mehmet, ibrahim]
		

		Stream.of(liste,liste1).flatMap(t->t.stream()).forEach(t->System.out.print(t+", "));
		//output: Ali, John, Ali, Alexander, Taylor, Ali, Jackson, Ali, Veli, Kemal, Alexander, Yusuf, Mehmet, ibrahim,  
		System.out.println();
		System.out.println("*******************************************************");
		
		
		
		
		
		
//      4) "J" ile baslayin olan öğeleri almayın
		System.out.println(" SORU 4 :");
		liste.stream().filter(t->!t.startsWith("J")).forEach(t->System.out.println(t+", "));
		System.out.println("*******************************************************");

		
		
		
//      5) Farklı öğeleri seçin
		System.out.println("*******************************************************");
		System.out.println(" SORU 5 : Farklı öğeleri seçin");
		liste.stream().distinct().forEach(t->System.out.println(t+","));

//      6)Karakter sayısına göre doğal sıraya koyun
		System.out.println("*******************************************************");
		System.out.println(" SORU 6 : Karakter sayısına göre doğal sıraya koyun");
		liste.
		stream().
		sorted(Comparator.
				comparing(t->t.toString().
						length())).
		forEach(t->System.out.println(t));
		
		
//      7) Tüm öğeleri büyük harfe dönüştürün
		System.out.println("*******************************************************");
		System.out.println(" SORU 7 : Tüm öğeleri büyük harfe dönüştürün");
		liste.
		stream().
		map(t->t.toUpperCase()).
		forEach(System.out::println);
		
		
//      8) Konsoldaki öğeleri yazdırın
		System.out.println("*******************************************************");
		System.out.println(" SORU 8 : Konsoldaki öğeleri yazdırın");
		liste.stream().forEach(t->System.out.println(t));
		
		
//      9)Fonksiyonel Programlama'yı kullanın
		System.out.println("*******************************************************");
		System.out.println(" SORU 9 : Fonksiyonel Programlama'yı kullanın");
		
		
		
		
		
	}
}