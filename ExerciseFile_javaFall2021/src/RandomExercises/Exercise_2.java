package RandomExercises;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		/*Soru 4:
		 * Kullanicidan 8 primitive veri tipinde de deger alalim ve ekrana yazdiralim.				
	     * 1. Adim : Scanner class'i ile kullanicidan veri alalim				
	     * 2. Adim : Aldigimiz her bir veriyi degiskenlere atayalim				
	     * 3. Adim : Ekrana yazdiralim.				
	       	INPUT      : 41			
	        OUTPUT  : Kullanicidan Aldigimiz sayi = 41		
				
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen Bir Boolean Girin: ");
		boolean boolean1 = scan.nextBoolean();
		System.out.println(boolean1);
		
		System.out.print("Lütfen Bir Char Girin: ");
		char char1 = scan.next().charAt(0);		
		System.out.println(char1);

		
		System.out.print("Lütfen Bir byte Girin: ");
		byte byte1 = scan.nextByte();		
		System.out.println(byte1);

		
		System.out.print("Lütfen Bir short Girin: ");
		short short1 = scan.nextShort();
		System.out.println(short1);

		System.out.print("Lütfen Bir int Girin: ");
		int int1 = scan.nextInt();		
		System.out.println(int1);
		
		System.out.print("Lütfen Bir long Girin: ");
		long long1 = scan.nextLong();
		System.out.println(long1);
		
		System.out.print("Lütfen Bir float Girin: ");
		float float1 = scan.nextFloat();
		System.out.println(float1);
		
		System.out.print("Lütfen Bir double Girin: ");
		double double1 = scan.nextDouble();
		System.out.println(double1);

		scan.close();
		

		
	}

}
