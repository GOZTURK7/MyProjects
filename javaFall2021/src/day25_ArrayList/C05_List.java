package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {

		/*
		 * Verilen bir listede içinde belirli bir harf olan elemanları silen bir program
		 * yazınız.
		 */

		List<String> str = new ArrayList<>();

		str.add("Jeyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");

		System.out.println(str);

		String silinecekHarf = "a";

		System.out.println(killThemAll(str, silinecekHarf));

	}
	private static List<String> killThemAll(List<String> str, String silinecekHarf) {

		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekHarf)) {
				str.remove(i);
				i--;  // sorunun trick'i burada removedan sonra list'in size()'ı değiştiği için for
					// döngüsünü ona göre adjust etmemiz lazımdı o yüzden i--; yapıyoruz her
					// remove'dan sonra.
			}
		}
		return str;
	}
}
