package JavaLamda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda05 {

	public static void main(String[] args) {


		
		System.out.println(topla(10));
		System.out.println("**************");
		System.out.println(topla1(10));
		System.out.println("**************");
		System.out.println(topla2(10));
		System.out.println("**************");
		System.out.println(toplaCift(10));
		System.out.println("**************");
		System.out.println(toplaIlkCift(10));
		System.out.println("**************");
		System.out.println(ilktekSayiTopla(10));
		System.out.println("**************");
		ikiIlkXKuvveti(5);
		System.out.println();
		istenenSayiIlkXKuvvet(2,3);
		System.out.println();
		System.out.println("**************");
		istenenSayiIlkXKuvvet(1,10);
		System.out.println();
		System.out.println("**************");
		System.out.println(isteneSayiIlkXinciKuvveti(2,4));
		System.out.println("**************");
		System.out.println(istenenSayiFact(3));


		
		
		
		
		
	}
	
	
	
	//TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program yaziniz.
	// Structured Programming
	public static int topla(int x) {
		int toplam = 0;
		for (int i = 0; i < x; i++) {
			toplam+=i;
			
		}return toplam;
	}
	
	// Functional Programming:
	public static int topla1(int x) {
		
		return IntStream.range(1, x+1).sum(); // 1,2,3,4, ....x; elemanlarının akışı for akışını IntStream ile sağladık.
	}
	
	// Functional Programming: 2. YOL;
		public static int topla2(int x) {
			
			return IntStream.rangeClosed(1, x).sum(); // 1,2,3,4, ....x; elemanlarının akışı for akışını IntStream ile sağladık.
		}
	
	

	//TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz
		public static int toplaCift(int x) {
			
			return IntStream.rangeClosed(1, x).filter(t->t%2==0).sum();
		}
		
		
	//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program yaziniz
		public static int toplaIlkCift(int x) {
			
			return IntStream.
					iterate(2, t->t+2). // 2, 4, 6, 8, ..... diye sonsuz bir akış verdi burası
					limit(x). // limit ise bu sonsuza giden akışı x'e kadar olacak şekilde sınırladı.
					sum(); // hepsini topladı.
		}

		
		
	//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi yaziniz
		public static int ilktekSayiTopla(int x) {
			
			return IntStream.
					iterate(1, t->t+2). // akıştaki 1'den başlayarak tek sayıları akışa alır.
					limit(x). // bu akışı ilk x tane tek sayıyı alacak şekilde sınırladı.
					sum(); // bunların hepsini topladı.
		}

	//TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi yaziniz
		public static void ikiIlkXKuvveti(int x) {
			IntStream.iterate(2, t->t*2).limit(x).forEach(t->System.out.print(t+" "));
		}

	//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi yaziniz
		public static void istenenSayiIlkXKuvvet(int a, int x) {
			IntStream.
			iterate(a, t->t*a).
			limit(x).
			forEach(t->System.out.print(t+" "));
		}

	//TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi yaziniz
		public static int istenenSayiFact(int x) {
			
			return IntStream.rangeClosed(1, x). //reduce(Math::multiplyExact);
				reduce(1, (t,u)->t*u);
		}
		
	//TASK 08 --> Istenilen bir sayinin ilk x. kuvvetini ekrana yazdiran programi yaziniz
		public static int isteneSayiIlkXinciKuvveti(int a, int x) {
			
			return	IntStream.
			iterate(a, t->t*a).
			limit(x).reduce(0, (t,u)->u);
			
			
			
		}
		
		


}
