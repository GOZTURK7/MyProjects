package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_KullanıcıdanAlınanArrayinKaçıUceTamBolunur {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde
		// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Array'e ait 8 adet element giriniz");

		int arr[] = new int[8];

		boolean flag = true;
		int uceBolunen = 0;
		int numOfElement = 0;
		while (flag) {
			int element = scan.nextInt();
			arr[numOfElement] = element;
			numOfElement++;
			System.out.println("Girdiğiniz " + numOfElement + ". element: " + element);

			if (numOfElement == 8) {
				System.out.println("8 adet element girdiniz Array'iniz aşağıdaki gibidir:");
				System.out.println(Arrays.toString(arr));
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < 0) {
						arr[i] *= -1;
					}
					if (arr[i] % 3 == 0) {
						uceBolunen++;
					}
				}System.out.println("üçe bölünenlerin sayısı :" + uceBolunen);
				flag = false;

			}

		}

	}

}
