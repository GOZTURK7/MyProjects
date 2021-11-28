package day22_arrays;

import java.util.Arrays;

public class C01_BinarySerch {

	public static void main(String[] args) {


		String isimler [] = {"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
		
		/*
		 * İsimler array'inde Murat ismi var mı ?
		 */
		
		
		
		// array'de arama yapmadan önce sıralama sort() yapmalıyız.	
		Arrays.sort(isimler); // !!!!!! sort yaptıktan sonra natural order'a göre büyükten küçüğü sıralıyor ve 
		//İSİMLER ARRAY'İ KALICI OLARAK DEĞİŞİYOR.
		System.out.println(Arrays.toString(isimler));
		
		isimler[4] = "Ainagul";
		System.out.println(Arrays.toString(isimler));
		
		Arrays.sort(isimler); // tekrar sort yapalım ki değişiklikten sonra sıralamayı tekrar düzeltsin.
		System.out.println(Arrays.toString(isimler));
		
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); // 4
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); // -5 olsaydı beşinci sırada olurdu indeks değil dikkat 
		// indeks olarak düşünürsek 4. indeks aslında.

		
		System.out.println(Arrays.binarySearch(isimler, "Tuba")); // -6
		
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); // -4 Kursat ile Kutlu aynı o yüzden içerideki harflerin sırasına göre 
		// kontrol edip konumlandırıyor r t'den önce geldiği için Kursat olsaydı 4'üncü sırada olurdu.


		
	}

}
