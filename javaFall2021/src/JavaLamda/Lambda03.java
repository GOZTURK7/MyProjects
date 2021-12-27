package JavaLamda;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import day20_scope.StaticVar;

public class Lambda03 {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>(Arrays.asList(
				"mehmet","emre","nilgun","yıldız",
				"kader","emine","islam","islam","Wabuziddin","cincix"));
		
		bykHrfTekrarsizSira(list);
		System.out.println();
		System.out.println("*******");
		karakterSayisiTekrarsizTersSirali(list);
		System.out.println();
		System.out.println("*******");
		karakterSayisiSiraliEl(list);
		System.out.println();
		System.out.println("*******");
		sonHarfTersSiraliEl(list);
		System.out.println();
		System.out.println("*******");
		ciftKareTekrarsizTersSira(list);
		System.out.println();
		System.out.println("*******");
		harfSayisi7Kontrol(list);
		System.out.println();
		System.out.println("*******");
		wBaslamaKontrol(list);
		System.out.println();
		System.out.println("*******");
		xbitmeKontrol(list);
		System.out.println();
		System.out.println("*******");
		karakteriEnBuyukEl(list);
		
		
		
	}

//	TASK 1 : LİST elemanlarını alfabetik büyük harf  ve tekrarsız yazdırın.
	
	public static void bykHrfTekrarsizSira(List<String> list) {
		
		list.
		stream().
		//map(t->t.toUpperCase()) büyük harf yap
		map(String :: toUpperCase).// büyük harf yap
		sorted(). // doğal sıralı sırala 
		distinct().// tekrarsız yapıldı.
		forEach(t-> System.out.print(t + " ")); // yazdırıldı.
	}
	
//	TASK 2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz yazdiriniz
	
	public static void karakterSayisiTekrarsizTersSirali(List<String> list) {
		
		list.
		stream().
		map(t->t.length()). // String data karakter sayısına update edildi.
		sorted(Comparator.reverseOrder()). // ters sıra yaptık
		distinct(). // tekrarsiz yaptırdık
		forEach(Lambda01::printEl); // yazdırdık
	}
	
//	TASK 3 : list elemanlarını karakter sayısına göre küçükten büyüğe doğru yazdırın
	
	public static void karakterSayisiSiraliEl(List<String> list) {
		
		list.stream().sorted(Comparator.comparing(t -> t.length())).forEach(t->System.out.print(t + " "));;
	
		
	}
	
//	TASK 4 : list elemanlarını son harfine göre ters sıralı yazdırınız.
	
	public static void sonHarfTersSiraliEl(List<String> list) {
		
		list.stream().
		sorted(Comparator.
				comparing(t->t.toString().
						charAt(t.toString().length()-1)). // elemanın length()-1 --> son indeksinin karakterini alır
				reversed()). // elemanın length()-1 --> son indeksinin karakterini ters sıralar
		forEach(t->System.out.print(t+" "));;
		
	}
	
// TASK 5 :	Cift sayili elemanlarin karelerini hesaplayan, tekrarli olanlari sadece bir kere buyukten kucuge dogru
	//yazdiran bir program yaziniz.
	
	public static  void ciftKareTekrarsizTersSira(List<String> list) {
		
		list.
		stream().
		map(t->t.length()*t.length()).
		filter(Lambda01::ciftBul).
		distinct().
		sorted(Comparator.reverseOrder()).
				forEach(Lambda01::printEl);
		
		
	}
	
//	TASK 6 : list elemanlarının karakter sayısının 7 ve 7'den az olma durumunu kontrol ediniz.
	
	public static void harfSayisi7Kontrol(List<String> list) {
		
//		boolean kontrol = list.stream().allMatch(t->t.length()<=7);
//		if(kontrol) {
//			System.out.println("List elemanları 7 harften büyük değil");
//		}else {
//			System.out.println("List elemanları 7 harften büyük.");
//		}
//		
		System.out.println(
				list.stream().
				allMatch(t->t.length()<=7) 
				? ("List Elemanları 7 Harften Büyük değil")
				:("List elemanları 7 den büyük")
						);

	}
	
	
//	TASK 7 list elemanlarının "W" ile başlamasını kontrol ediniz.
	
	public static void wBaslamaKontrol(List<String> list) {
		
		System.out.println(list.stream().noneMatch(t->t.startsWith("W")) ? ("List Elemanları W başlayan yok")
		:("List elemanları w ile başlayan var")
				);
		
	}
	
	
//	TASK 8 list elemanlarının "x" ile başlamasını kontrol ediniz.
	
	//List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz
    public static void xbitmeKontrol(List<String> list){
        System.out.println(list.
                stream().
                anyMatch(t -> t.endsWith("x"))?"x ile biten isim kimse ayaga kalksin":"AGAM x ile biten isim oluuuurrr ");
//anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    }
    
//    TASK 9 : Karakter sayısı en büyük elemanı yazınız.
    
    public static void karakteriEnBuyukEl(List<String> list) {
    	
    System.out.println(list.
    		stream().
    		sorted(Comparator.comparing(t-> t.toString().length()). // length karakter uzunluğuna göre sıraladı k ->b
    				reversed()).
    		findFirst());
    	
    }
    
    
}
