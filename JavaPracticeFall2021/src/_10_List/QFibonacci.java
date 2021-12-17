package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
	/*
	 * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
	 * 1-1-2-3-5-8-13-21-34....
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		List<Integer> liste1 = new ArrayList<>();
		liste1.add(0);
		liste1.add(1);

		int sayi = 0;

		for (int i = 0; i < num; i++) {
			sayi = liste1.get(i) + liste1.get(i + 1);
			if (sayi < num) {
				liste1.add(sayi);
			} else {
				break;
			}

		}
		liste1.remove(0);
		System.out.println(liste1);

	}

}
