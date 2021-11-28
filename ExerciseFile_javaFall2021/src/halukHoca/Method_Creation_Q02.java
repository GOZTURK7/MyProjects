package halukHoca;

import java.util.Scanner;

public class Method_Creation_Q02 {
	public static void main(String[] args) {
		/*
		 * name1 ve name2 degiskenlerini olusturun. name1 degiskeninin karakter sayisi
		 * cift ise kelimenin ortasina name2 yi yerlestirin. name1 degiskeninin karakter
		 * sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
		 * yazdirinan bir method oluşturun e.g: name1= mehmet name2= ahmet Print ==>
		 * mehahmetmet
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("lütfen name1 giriniz");
		String name1 = scan.next();
		System.out.println("lütfen name2 giriniz");
		String name2 = scan.next();

		ortasinaEkleme(name1, name2);
		
		scan.close();

	}

	public static void ortasinaEkleme(String n1, String n2) {
		int uzunlukName1 = n1.length();
		if (uzunlukName1 % 2 == 0) {
			System.out.println(n1.substring(0, uzunlukName1 / 2).concat(n2).concat((n1.substring(uzunlukName1 / 2))));
		} else {
			System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
		}
		
	}

}
