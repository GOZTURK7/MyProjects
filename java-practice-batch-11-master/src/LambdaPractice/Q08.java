package LambdaPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q08 {
	
	public static void main(String[] args) {
		
	 // 7 ile bolunebilen ilk 10 tamsayinin toplamini ekrana yazdiriniz.
		
		  //1.way
        System.out.println(IntStream
                .rangeClosed(1, 70)//1ile 70arasindaki sayilari yzdirmaya yarar
                .filter(t -> t%7 == 0)
                .sum());

        //2.way
        System.out.println(IntStream
                .iterate(7, t -> t + 7)//7den baslayip 7ser 7ser
                .limit(10)
                .sum());
        
     
        // SERBEST ÇALIŞMA;
        
        IntStream.iterate(0, t -> t + 10).limit(3).forEach(t->System.out.println(t + " "));
        System.out.println("==========================================");
        IntStream.rangeClosed(0, 100).filter(t->t%5==0).forEach(System.out::println);
        
        
        
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        		
        List<Integer> liste =  IntStream.rangeClosed(0, 100).filter(t->t%5==0).boxed().collect(Collectors.toList());
        
//        BOXED() METHOD;
        
     
//
//        mapToInt produces an IntStream, which doesn't have collect method taking a single Collector argument.
//
//        Since the end result is a List<Integer>, you don't have to transform the Stream to an IntStream:
//
//        List<Integer> lengths = a.stream().map(String::length).collect(Collectors.toList());
//        Transforming the Stream to an IntStream would make sense if you want to collect the elements of the Stream to an primitive array:
//
//        int[] lengths = a.stream().mapToInt(String::length).toArray();
		  
		
	}
	
}
