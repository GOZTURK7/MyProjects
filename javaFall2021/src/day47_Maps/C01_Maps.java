package day47_Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		
		
//		1- bir Map oluşturmadan önce Map'e koyacağımız key ve value değerlerini incelemeliyiz, tüm değerleri
//		koyabilmek için key ve value için Object, Object seçebiliriz. Elemanlara ait bilgilere ulaşmakta zorlaanabiliriz.
//		data türünü seçerken hem içine koyacağımız tüm elemanları kapsayacak bir data türü seçmeliyiz, hem de içine 
//		koyduğumuz tüm elemanları işleyebilecek basit data türü seçmeliyiz.
		
//		2- Map'i oluştururken map'in türüne de karar vermeliyiz.
		
		Map<Integer, String>  sinif = new HashMap<>();
		
		
		sinif.put(101, "Ali, Can, J.Dev");
		sinif.put(102, "Veli, Yan, QA");
		sinif.put(103, "Ali, Yan, C#");
		
		
		int no=104;
		String isim = "Ayse";
		String soyisim = "Can";
		String brans = "QA";
		
		sinif.put(no, isim+", "+soyisim+", "+brans);

		
		
		System.out.println(sinif); //	{101=Ali, Can, J.Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#, 104=Ayse, Can, QA}
//										key=value			  key=Value			 key=Value		   Key=value
		
		
		System.out.println(sinif.get(102)); //Veli, Yan, QA
		System.out.println(sinif.get(104)); //Ayse, Can, QA

		
//		Map'teki tüm key'leri görelim;
		
		System.out.println(sinif.keySet()); //[101, 102, 103, 104] keySet(); key'lerin Set görünümlü halini verir.
		
		
//		Map'teki tüm value'leri görmek istersek
		System.out.println(sinif.values()); //[Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]
//		values() valueleri collection olarak veriyor. ancakyazdırma dışında birşey yapamayız.
		
		
		// sınıftaki öğrencilerin isimlerini bir liste'ye ekleyip yazdıralım.
		List<String> valueList = new ArrayList<> (sinif.values());
		System.out.println("vaule List" + valueList);
		
		System.out.println(valueList.size()); // 4 
		
		
		List<String> isimListesi = new ArrayList<>();
		String bilgiler[] = new String[3];
		
		for (int i = 0; i <valueList.size(); i++) {
			bilgiler=valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);
		}
		
		System.out.println(isimListesi);
		
	
		

		
		
		
		
	}

}
