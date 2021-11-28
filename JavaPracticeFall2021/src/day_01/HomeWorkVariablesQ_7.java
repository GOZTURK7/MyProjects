package day_01;

import java.util.Scanner;

public class HomeWorkVariablesQ_7 {


	public static void main(String[] args) {
	
		/*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut 
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen Kilonuzu Giriniz: ");
		int kilo = scan.nextInt();
		
		System.out.print("Lütfen Boyunuzu Metre Cinsiniden Giriniz: ");
		double boy = scan.nextDouble();
		
		int vki = (int) (kilo / (boy*boy));
		System.out.print("Vücut Kitle Indeksiniz: " + vki);
		
		scan.close();

	}

}
