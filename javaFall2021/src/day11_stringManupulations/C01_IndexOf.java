package day11_stringManupulations;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir cüle giriniz");
		
		String cumle = scan.nextLine();
		
		System.out.println("Lütfen varlığını kontrol etmek için bir harf giriniz");
		
		char krk = scan.next().charAt(0);
		
		int index = cumle.indexOf(krk); // girilen karakterin cümledeki indeksini verir.
		
		if (index < 0) { // if(index == (-1) şeklinde de yazabiliriz.
			System.out.println("girdiğiniz harf verilen cümlede yok");

		}else {
			System.out.println("girdiğiniz harf verilen cümlede var");

		}
		scan.close();
	}

}
