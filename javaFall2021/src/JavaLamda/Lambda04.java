package JavaLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.JSpinner.ListEditor;

public class Lambda04 {

	public static void main(String[] args) {

		
		TechPro trGunduz = new TechPro("yaz", "TR gunduz",97,124);
		TechPro engGunduz = new TechPro("kis", "ENG gunduz",95,131);
		TechPro trGece = new TechPro("bahar", "TR gece",98,143);
		TechPro engGece = new TechPro("sonbahar", "ENG gece",93,151);
		
		
		List<TechPro> list = new ArrayList<>(Arrays.asList(trGunduz, engGunduz, trGece, engGece));
		
		
		
//		Bu Class'da ağırlıklı olarak return type çalışacağız
		
		System.out.println(batchOrt92Byk(list));
		System.out.println("****************");
		System.out.println(ogrcSayisi110Az(list));
		System.out.println("****************");
		System.out.println(herhangiBirBaharKontrol(list));
		System.out.println("****************");
		System.out.println(ogrcSayilariBykKckSirala(list));
		System.out.println("****************");
		System.out.println(batchOrtTersSiraliBatch(list));
		System.out.println("****************");
		System.out.println(ogrcSayisiEnAz2Batch(list));
		System.out.println("****************");
		System.out.println(batchOrt95BykOgrcSayisi(list));
		System.out.println("****************");
		System.out.println(batchOrt95BykOgrcSayisi1(list));
		System.out.println("****************");
		System.out.println(ogrcSayisi130BykBatchOrtalama(list));
		System.out.println("****************");
		System.out.println(gunduzBatchSayisi(list));
		System.out.println("****************");
		System.out.println(ogcSayi130BykBatchEnBykBatchOrt(list));
		System.out.println("****************");
		System.out.println(ogcSayi150KckBatchEnKckBatchOrt(list));




		
	}
	
//	TASK 1 : batch ortalamalarının 92'den büyük olduğunu kontrol eden kod yaz:
	
	public static boolean batchOrt92Byk(List<TechPro> list) {		
		return list.
				stream().
				allMatch(t->t.getBatchOrt()>92);  // AKIŞTAKİ HER ELEMAN batchOrt field'ına göre eşleşmesi kontrol edildi.	
	}
	
	
//	TASK 2 : öğrenci sayılarının her hiçbirinin 110'dan az olmadığını kontrol eden bir program yazınız;
	
	public static boolean ogrcSayisi110Az(List<TechPro> list) {	
		return list.
				stream().
				noneMatch(t-> t.getOgrcSayisi()<110); // allMathch(t-> t.getOgrcSayisi()>=110 alternatif
	}
	
	
//	TASK 3: Batch'lerde herhangi birinde "bahar" olup olmadığını kontrol ediniz;
	
	public static boolean herhangiBirBaharKontrol(List<TechPro> list) {	
		return list.
				stream().
				anyMatch(t->t.getBatch().equals("bahar"));
	}
	
//	TASK 4 : batch'teki öğrenci sayılarını büyükten küçüğe doğru sıralayınız.
	
	public static List<TechPro> ogrcSayilariBykKckSirala(List<TechPro> list) {
		
		return list.
				stream().
				sorted(Comparator.
						comparing(TechPro :: getOgrcSayisi).
						reversed()).
				collect(Collectors.toList()); // akıştan çıkan objeleri elemanları topla listeye at;
					// Collectors.toList() -> collect'te toplanan elemanları list'e çevirir.
		
	}
	
	
//	TASK 5 : batch'leri batch ortalamalarına göre Büyükten küçüğe sıralayıp ilk 3 tanesini yazdırın
		
public static List<TechPro> batchOrtTersSiraliBatch(List<TechPro> list) {
		
		return list.
				stream().
				sorted(Comparator.
						comparing(TechPro ::getBatchOrt).
						reversed()).
				limit(3). // akıştaki elemanların ilk 3 tanesini aldım.
				collect(Collectors.toList()); // akıştan çıkan objeleri elemanları topla listeye at;
					// Collectors.toList() -> collect'te toplanan elemanları list'e çevirir.
		
	}

//	TASK 6 : Batchleri öğrenci sayısı en az olan 2. bathc'i yazdırınız;

public static List<TechPro> ogrcSayisiEnAz2Batch (List<TechPro> list) {
	
	return list.
			stream().
			sorted(Comparator.
					comparing(TechPro::getOgrcSayisi)).
			limit(2).
			skip(1).
			collect(Collectors.toList());	
}

//	TASK 7 : Batch ortalamaların 95'ten büyük olan olan batchlerin oğrenci sayıları toplamını yaz.

public static int batchOrt95BykOgrcSayisi (List<TechPro> list) {
	
	return list.stream().filter(t-> t.getBatchOrt()>95).map(t->t.getOgrcSayisi()).reduce(0, Integer::sum);
	

	
	}

//	TASK 8 : public static int batchOrt95BykOgrcSayisi (List<TechPro> list) {

public static int batchOrt95BykOgrcSayisi1 (List<TechPro> list) {
	
	return list.
			stream().
			filter(t-> t.getBatchOrt()>95).
			mapToInt(t->t.getOgrcSayisi()). // mapToInt --> type göre int return eder ki sum() methodu çalışsın yukarıdaki örnekteki 
			// reduce vb yapmaya gerek kalmadan daha kısa olarak yazmamızı sağlar lambda'nın amacı da bu zaten kod sadeliği.
			sum(); // bu sum() lambdanın kendi methodu Math :: sum yapmamıza gerek kalmadı yüzden yada Integer :: sum yapmamız gerek kalmadı.

	
	
}

// TASK 9 öğrenci sayıları 130'dan büyük olan batch'lerin batch ortalamalarının ortalamasını alın .

	public static OptionalDouble ogrcSayisi130BykBatchOrtalama (List<TechPro> list) {
	
		return list.
			stream().
			filter(t->t.getOgrcSayisi()>130).
			mapToInt(t-> t.getBatchOrt()).
			average(); // average() akıştan gelen map ile type'ini değiştirdiğimiz elemanları akıştan alıp ortalamalırını alıp döndü bana average,
	}

//task 10-->gunduz batch'lerinin sayisini  yazdiriniz.

	public static int gunduzBatchSayisi(List<TechPro> list) {
		
		return (int) list.
				stream().
				filter(t->t.getBatchName().contains("gunduz")).
				count();
	}

//task 11-->Ogrenci sayilari 130'dan fazla olan batch'lerin en buyuk batch ort'unu bulunuz
	
	public static OptionalInt ogcSayi130BykBatchEnBykBatchOrt (List<TechPro> list) {
			
		return list.
				stream().
				filter(t-> t.getOgrcSayisi()>130).mapToInt(TechPro::getBatchOrt).max();
				
				
				
//				sorted(Comparator.
//						comparing(TechPro::getBatchOrt).
//						reversed()).limit(1).
//				forEach(t->System.out.println(t.getBatchOrt() + " "));
	}
	
	
	
//task 12-->Ogrenci sayilari 150'dan az olan batch'lerin en kucuk batch ort'unu bulunuz.

	public static OptionalInt ogcSayi150KckBatchEnKckBatchOrt (List<TechPro> list) {
		
		return list.
				stream().
				filter(t-> t.getOgrcSayisi()<150).mapToInt(TechPro::getBatchOrt).min();
				
				
//				sorted(Comparator.
//						comparing(TechPro::getBatchOrt)).limit(1).
//				forEach(t->System.out.println(t.getBatchOrt() + " "));
	}




}
