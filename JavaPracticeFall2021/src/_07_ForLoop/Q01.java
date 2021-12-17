package _07_ForLoop;

import java.util.Scanner;

public class Q01 {
	/*
	 * 
	 * sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır. DEĞİLSE
	 * While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE
	 * kullanılır.
	 * 
	 * Problem Tanımı 100'den 0'a kadar 13'e tam bölünebilen sayıları ve
	 * toplamlarını ekrana yazdırınız (büyükten küçüğe).
	 * 
	 * Ekran Çıktısı 91 78 65 52 39 26 13
	 */
	public static void main(String[] args) {

		for (int i = 100; i > 0; i--) {
			if (i % 13 == 0) {
				System.out.println(i);
			}
		}

		//////////// while ile ///////////

		int i1 = 100;

		while (i1 > 0) {
			if (i1 % 13 == 0) {
				System.out.print(i1);
			}
			i1--;
		}

		
		///////// do while ile ////////////
		
		int i2= 100;
		
		do {
			if(i2%13==0) {
				System.out.println(i2);
			}
			i2--;
		}while(i2>0);
		
		
	}
}
