package day29_staticBlocks_PassByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {


		int sayılar [] = {3, 4, 5, 6};
		
		
		
		elemanDegistir(sayılar);
		System.out.println("Eleman değiştir methodundan sonra : "+Arrays.toString(sayılar));

		
		arrayiDegistir(sayılar);
		System.out.println("Array'i değiştir methodundan sonra : "+Arrays.toString(sayılar));

		
	}

	private static void arrayiDegistir(int[] sayılar) {
		sayılar=new int[6];
		System.out.println("Array'i değiştir methodunda : "+Arrays.toString(sayılar));

	}

	private static void elemanDegistir(int[] sayılar) {


		sayılar[0]=10;
		System.out.println("Eleman değiştir methodunda : "+Arrays.toString(sayılar));
	}

}
