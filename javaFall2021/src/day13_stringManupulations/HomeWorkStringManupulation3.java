package day13_stringManupulations;

import java.util.Scanner;

public class HomeWorkStringManupulation3 {

	public static void main(String[] args) {
		// soru3	Kullanicidan isim isteyin, eger isim "a" harfi iceriyorsa,
		//girdiginiz isim a harfi iceriyor,
		//eger "Z" harfi iceriyorsa , girdiginiz isim Z harfi iceriyor yazdirin, 
		//ikisi de yoksa girdiginiz isim a ve Z harfi icermiyor yazdirin.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz: ");
		
		String isim = scan.nextLine();
		
		if (isim.contains("a") && isim.contains("Z")){
			System.out.println("girdiginiz isim HER İKİ HARFİ DE  iceriyor");
		}else if (isim.contains("Z")) {
			System.out.println("girdiginiz isim Z harfi iceriyor");
		}else if (isim.contains("a")){
			System.out.println("girdiginiz isim a harfi içeriyor");
		}else {
			System.out.println("girdiginiz isim a ve Z harflerini içermiyor");

		}
		scan.close();
		
	}

}
