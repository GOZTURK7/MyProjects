package day29_staticBlocks_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {

		/*
		 * bir list oluşturalım sonra list elemanlarını değiştir method'u yazıp orada
		 * list elemanlarından bazılarını değiştirelim method void olsun main method'a
		 * döndükten sonra yeniden list'i yazdıralım.
		 */

		List<String> harfler = new ArrayList<>();

		harfler.add("A");
		harfler.add("B");
		harfler.add("C");

		listElemanlarDegistir(harfler);
		System.out.println("Main Method'a dönünce list : " + harfler); // [D, B, C]

		/*
		 * java'da list ve Array gibi objeler için de pass by value geçerlidir yani
		 * farklı bir method'da array veya list'e yeni değer ataması yaparsanız orjinal
		 * array veya list değişmez.
		 */

		listDegistir(harfler);
		System.out.println("List'e yeni list atadıktan sonra Main Method'a dönünce list: " + harfler); // method'da yeni
																										// değer
																										// atatığım
																										// halde harfler
																										// listesi
																										// değişmedi.

	}

	private static void listDegistir(List<String> harfler) {
		harfler = new ArrayList<>();
		System.out.println("Method'da List'e yeni değer atayınca : " + harfler); // [D, B, C]
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		harfler.set(0, "D");
		System.out.println("Method'da değiştirdiğimiz list: " + harfler);

	}

}
