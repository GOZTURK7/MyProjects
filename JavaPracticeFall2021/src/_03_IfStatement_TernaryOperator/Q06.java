package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

       
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Lütfen X koordinati için bir tam sayı giriniz:");
    	int x = scan.nextInt();
    	
     	System.out.println("Lütfen Y koordinati için bir tam sayı giriniz:");
    	int y = scan.nextInt();
    	
    	
    	if (x > 0 && y > 0) {
			System.out.println("Girmiş olduğunuz koordinat: (" + x + ", " + y + ") "
					+ "\nKoordinat Düzleminde 1. Bölge'dedir." );
		}else if (x < 0 && y > 0) {
			System.out.println("Girmiş olduğunuz koordinat: (" + x + ", " + y + ") "
					+ "\nKoordinat Düzleminde 2. Bölge'dedir." );
		}else if (x < 0 && y < 0) {
			System.out.println("Girmiş olduğunuz koordinat: (" + x + ", " + y + ") "
					+ "\nKoordinat Düzleminde 3. Bölge'dedir." );
		}else {
			System.out.println("Girmiş olduğunuz koordinat: (" + x + ", " + y + ") "
					+ "\nKoordinat Düzleminde 4. Bölge'dedir." );
		}
    	scan.close();
    	
    	
    	
    	
    }
}
