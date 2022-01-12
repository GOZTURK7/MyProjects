package LambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {
    
   
    
	
	public static void main(String[] args) {
		
		//Fonksiyonel Programlama ile [12, 9, 13, 4, 6, 2, 4, 12, 15] listesindeki tüm tek sayıları yazdırın
		List<Integer> list = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		list.stream().filter(t-> t%2==1).forEach(System.out :: println);
		System.out.println("==========================================");
		
		
		 //6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
		list.stream().filter(t->t>6 && t<14).mapToInt(t->t*t).forEach(System.out::println);
		System.out.println("==========================================");

		
		//Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz,
				System.out.println(list.
				stream().
				filter(t->t%2==1).
				mapToDouble(Math :: sqrt).sum());
			
		
		
		
		
		
		 //2.way
        System.out.println(list.stream()
                .filter(t -> t % 2 == 1)
                .mapToDouble(Math::sqrt)
                .sum());
        //3.way
        System.out.println(list.stream()
                .filter(t -> t % 2 == 1)
                .map(Math::sqrt)
                .reduce(Double::sum));
	}
}
