package JavaLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;


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
		list.stream().map(t->t.toUpperCase()).distinct().sorted().forEach(t->System.out.print(t + " "));
		//list.stream().map(t->t.toUpperCase()).distinct().sorted().forEach(System.out::print);               //CINCIXEMINEEMREISLAMKADERMEHMETNILGUNWABUZIDDINYILDIZ	
	}
	
//	TASK 2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz yazdiriniz
	
	public static void karakterSayisiTekrarsizTersSirali(List<String> list) {
		list.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(t->System.out.print(t + " "));

	}
	
//	TASK 3 : list elemanlarını karakter sayısına göre küçükten büyüğe doğru yazdırın
	
	public static void karakterSayisiSiraliEl(List<String> list) {
	
		list.stream().sorted(Comparator.comparing(t-> t.length())).forEach(t->System.out.print(t + " "));
	}
	
//	TASK 4 : list elemanlarını son harfine göre ters sıralı yazdırınız.
	
	public static void sonHarfTersSiraliEl(List<String> list) {
		list.
		stream().
		sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
		forEach(t->System.out.print(t + " "));;
		
	}
	
// TASK 5 :	Cift sayili elemanlarin karelerini hesaplayan, tekrarli olanlari sadece bir kere buyukten kucuge dogru
	//yazdiran bir program yaziniz.
	
	public static  void ciftKareTekrarsizTersSira(List<String> list) {
		
		list.
		stream().
		filter(t->t.length()%2==0).
		map(t->t.length()*t.length()).
		distinct().
		sorted(Comparator.reverseOrder()).
		forEach(t->System.out.print(t+" "));
		
	}
	
//	TASK 6 : list elemanlarının karakter sayısının 7 ve 7'den az olma durumunu kontrol ediniz.
	
	public static void harfSayisi7Kontrol(List<String> list) {
		System.out.println(list.
				stream().allMatch(t-> t.length()<=7) ? 
						("List elemanlarının hepsi 7'den Küçük") :
			("List Elemanlarının hepsi 7'den küçük değil (arada en az bir tane 7'den büyük var)"));
		
	}
	
	
//	TASK 7 list elemanlarının "W" ile başlamasını kontrol ediniz. (yani W ile başlayan hiç yoksa true dönsün)
	
	public static void wBaslamaKontrol(List<String> list) {
		
		System.out.println(list.
				stream().
				noneMatch(t->t.startsWith("W")) ? 
						("Listede Hiç W ile Başlayan Yok") : 
							("Listede W ile başlayan en az bir tane var"));
	
	}
	
	
//	TASK 8 list elemanlarının "x" ile başlamasını kontrol ediniz.
	
	//List elelmanlarinin "x" ile biten en az bir elemaı var mı yok mu kontrol ediniz
    public static void xbitmeKontrol(List<String> list){
    	System.out.println(list.
    			stream().
    			anyMatch(t->t.endsWith("x")) ? 
    					("Listede x ile biten en az birtane eleman var") : 
    						("listede x ile biten hiç eleman yok"));

    }
    
//    TASK 9 : Karakter sayısı en büyük elemanı yazınız.
    
    public static void karakteriEnBuyukEl(List<String> list) {
    	
    	System.out.println(list.stream().reduce((x,y)->(x.length()<y.length() ? y : x)));  // 1. YOL KENDİ YÖNTEMİM
    	
    	
    	
    	System.out.println(list.									// 2. YOL
    			stream().
    			sorted(Comparator.
    					comparing(t-> t.toString().length()).
    					reversed()).
    			findFirst());
   
    
    }
}
