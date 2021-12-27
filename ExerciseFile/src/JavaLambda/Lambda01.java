package JavaLambda;

import java.util.List;

public class Lambda01{

	public static void main(String[] args) {


		
		List<Integer> liste = List.of(1,2,3,4,5,6,7,8,9,11);
		
		printElFunctional(liste);
		System.out.println();
		System.out.println("********");
		tekSayıKareleriYazdir(liste); // LAMBDA İFADELERİ İLE;
		System.out.println();
		System.out.println("********");
		tekSayıKareleriYazdir1(liste); // METOT REFERE EDEREK;
		System.out.println();
		System.out.println("********");
	}
	
	public static void printEl(int t) {
		
			System.out.print(t+" ");
			
		}
	
	
	
	public static void printElFunctional(List<Integer> liste) {
		
		liste.stream().filter(t-> t%2==0).forEach(Lambda01 :: printEl);
	}
	
	
	public static boolean tekMi(int a) { return a%2==1;}
	public static int kareAl(int a) {return a*a;}
	
	
//	bir listeyi parametre olarak alan ve listedeki her tek sayının karesini aralarında bir boşluk bırakarak konsola
//	yazdıran metodu 1. YOL LAMBDA İFADELERİ kullanarak yazdırın.
	
	
	public static void tekSayıKareleriYazdir(List<Integer> liste) {
		
		liste.stream().filter(t-> t%2==1).map(t-> t*t).forEach(t-> System.out.print(t+" "));
	}
// 2. YOL METOD REFERANSI KULLANARAK,
	
	public static void tekSayıKareleriYazdir1(List<Integer> liste) {
		liste.stream().	filter(Lambda01 :: tekMi).
						map(Lambda01::kareAl).
						forEach(Lambda01::printEl);
						
	}
}
