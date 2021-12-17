package _00_day_01;

import java.util.Scanner;

public class HomeWorkVariablesQ_8 {

	public static void main(String[] args) {
		/*
    	 * Kullanicidan alacaginiz vize2 vize2 ve final notlarini 
    	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
    	 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen Vize1 Notunu Giriniz: ");
		int vize1 = scan.nextInt();
		System.out.print("Lütfen Vize2 Notunu Giriniz: ");
		int vize2 = scan.nextInt();
		System.out.print("Lütfen Final Notunu Giriniz: ");
		int fınal = scan.nextInt();
		
		
		
		int ortalamaVize = ((vize1 + vize2)/2)/10*3;
		int ortalamaFinal = ((fınal/10)*7);
		
		System.out.print("Geçme Notunuz: " + (ortalamaVize + ortalamaFinal));
		
		scan.close();
		
		
		
		
		
		
		
	}


}
