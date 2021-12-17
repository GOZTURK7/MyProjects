package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {  
	
	public static void main(String[] args) {

	/* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
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
