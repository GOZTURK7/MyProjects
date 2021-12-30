package LambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q03 {
    //String isimlerden olusan bir list olusturun
    //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
//Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
//Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
//Konsoldaki farklı öğeleri ters sırada yazdırın.
//Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
	
public static void main (String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Lutfullah");
		list.add("Emine");
		list.add("Emine");
		list.add("Yusuf");
		list.add("Seyfullah");
		list.add("Hakan");
		
		System.out.println(list);
		
		System.out.println("*********************************************");

		
		list.stream().distinct().forEach(t->System.out.print(t.length()+ " "));
		
		System.out.println("************************************************");
		
		System.out.println(list.stream().distinct().sorted(Comparator.comparing(t->t.length())).collect(Collectors.toList()));
		
		
		System.out.println("************************************************");

		
		list.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(t->System.out.print(t+" "));;
		
		System.out.println("************************************************");

		list.stream().
		distinct().
		sorted(Comparator.reverseOrder()).
		forEach(t->System.out.print(t+" "));
		
		System.out.println("************************************************");
		
		list.stream().
		distinct().
		map(t->t.toUpperCase()).
		filter(t->t.length() < 7).
		sorted(Comparator.reverseOrder()).
		forEach(t->System.out.print(t+" "));

	}
	
	
}
