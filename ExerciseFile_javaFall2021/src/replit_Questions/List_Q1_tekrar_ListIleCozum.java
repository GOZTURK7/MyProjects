package replit_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List_Q1_tekrar_ListIleCozum {

	public static void main(String[] args) {

		/*
		 * Soru1: Write a Java program to get a String from user as input and find the
		 * maximum occurring character in that string. (Ignore case sensitivity) input :
		 * Learning java is easy output: maximum occurring character is : a
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().replaceAll("\\s", "");
			List<String> input1 = new ArrayList<>();
		
			for (int i = 0; i < input.length(); i++) {
				input1.add(i, input.substring(i, i + 1));
			}
			System.out.println(input1);

			
			
			
		int ctr[] = new int[256];
		int uzunluk = input1.size();

		
		
		for (int i = 0; i < uzunluk; i++) {
			ctr[(input1.get(i).charAt(0))]++; // ctr arrayinde "input1.get(i)" stringinden aldığımız
									// "charAt(i)" characteri diyeli 'a' bunun ascii değeri 97 ctr (interger) array
									// inde 97'inci elemente gidip default 0 değerini bir artır diyoruz burada.
									// bunu listedeki tüm karakterler için tekrarlıyor ve eşit ascii değerindeki
									// ctr arrayindeki kutucuk hep bir artıyor.
		}
		System.out.println(Arrays.toString(ctr));

		int max = -1; // -1 yaptık çünkü ctr array'indeki default değer 0 veya aynı karakter vardıysa
						// > 0 bir rakam

		char sonuc = ' '; //

		for (int i = 0; i < uzunluk; i++) {
			if (ctr[input1.get(i).charAt(0)] > max) { // ctr içinde "input1.get(0).charAt(0)" a denk gelen char'ın sayısal
				// değerinin ctre içinde denk geldiği indexteki değer > max ise;
				max = ctr[input1.get(i).charAt(0)];
				sonuc = input1.get(i).charAt(0);
			}

		}
		System.out.println("en çok tekrar eden: " + sonuc + "\ntekrar sayısı:  " + max);
		
		scan.close();


	}
}