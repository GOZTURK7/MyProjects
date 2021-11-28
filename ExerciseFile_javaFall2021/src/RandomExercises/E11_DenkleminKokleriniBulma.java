package RandomExercises;

import java.util.Scanner;

public class E11_DenkleminKokleriniBulma {

	public static void main(String[] args) {
		/*
		 * Ikinci Dereceden Bir Denklemin Koklerinin Bulunması Lise yillarinda
		 * ogrendigimiz ikinci derece denklem,
		 * ax2 + bx + c = 0
		 * seklinde ifade edilir. Denklemin Kokleri hakkinda bilgi sahibi olabilmek
		 * icin, denklemin diskriminantı adi verilen,
		 * ∆=b2–­4ac
		 * ifadesini hesaplamamiz gerekir. Diskriminantın degerlerine gore, eger ∆<0 ise
		 * denklemin gerçel sayilarla ifade edilebilecek bir Koku yoktur.
		 * ∆=0 ise denklemin, degerleri birbirine esit olan iki Koku vardir ve bunlar,
		 * x1=x2= –b/ (2a)
		 * seklinde hesaplanirlar. Bunlara iki kat kok ya da cakişik Kok adi verilir.
		 * ∆>0 ise de denklemin birbirinden farkli iki gerçel koku vardir ve bunlar, * 
		 * x1=(–b+√∆)/(2a)
		 * ve  
		 * x2=(–b–√∆)/(2a) * 
		 * seklinde hesaplanirlar.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 'ax2 + bx + c = 0' şeklindeki \nikinci dereceden denklem için değerleri 'a' değerini girin");
		int a = scan.nextInt();
		System.out.println("Lütfen 'b' değerini girin:");
		int b = scan.nextInt();
		System.out.println("Lütfen 'c' değerini girin:");
		int c = scan.nextInt();
		
		System.out.println("Girmiş olduğunuz denklem: " +a+"x2 + "+b+"x + "+ c);
		
		int delta = (b*b) -4*a*c;
		
		if (delta < 0) {
			System.out.println("Denklemin Gerçel Sayılarla İfade Edilebilecek Kökü Yoktur");
		} else if (delta == 0) {
			System.out.println("Denklemin x1=x2="+((-b)/2*a)+" Çakışık İki Kökü Vardır.");		
		} else {
			System.out.println("Denklemin birbirinden farklı x1="+((-b)+Math.sqrt(delta))/2*a +  " , x2=" + ((-b)-Math.sqrt(delta))/2*a + " şeklinde iki gerçek kökü vardır.");
		}
		scan.close();
		
		
	}

}
