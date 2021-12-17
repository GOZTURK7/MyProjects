package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {


		List<String> harfler = new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");

		System.out.println(harfler); //[A, Z, F, D]
		
		
		System.out.println(harfler.remove(1)); // 'Z' bu satır gidip 1 indexindeki elemanı remove eder
							// ve (delil olarak :) ) remove etteği elemanı bize getirir.	
		// Listenin tamamını görmek isterseniz listenin tamamını yeniden yazdırabilirsiniz.
		System.out.println(harfler);// [A, F, D]
		
		
		System.out.println(harfler.remove(2));//  'D'
		System.out.println(harfler);

		
		System.out.println(harfler.remove("F"));
		
		System.out.println(harfler.remove("B")); // listede B olmadığı için remove yapamaz.
		
		// indeks belirtince belirtilen indeksteki remove edilen harfi gönderiyor.
		// obje belirtildiğinde varsa siliyor true dönüyor yoksa silemiyor false dönüyor.
		

		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler);  //[A, A, Z, F]
		
		System.out.println(harfler.remove("A")); // true döndü sadece ilk bulduğu A'yı sildi.
		System.out.println(harfler); //[A, Z, F]
		
		harfler.add("A");
		System.out.println(harfler); //[A, Z, F, A]
		
		harfler.removeAll(harfler);
		System.out.println(harfler);  // []

		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler = new ArrayList<>();
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		System.out.println(harfler);
		System.out.println(silinecekHarfler);
		
		System.out.println(harfler.removeAll(silinecekHarfler)); //true
		System.out.println(harfler); // [Z, D]

		
		// eğer listemiz integer'lardan oluşuyorsa remove(index) ve remove(object)
		// methodları karışmasın diye girilen sayıyı index olarak kabul eder.
		


 
		
	}

}
