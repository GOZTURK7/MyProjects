package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Yaşınızı Giriniz:");
		int yas = scan.nextInt();
		
		System.out.println("Lütfen Kilonuzu Giriniz:");
		int kilo = scan.nextInt();
		
		String result = (yas >= 18) ? ((kilo>=50) ? ("Kan Bağışı Yapabilir") : ("Kan Bağışı Yapamaz")) : ("Kan Bağışı Yapamaz.");
		
		System.out.println(result);
		
		scan.close();
	}

}
