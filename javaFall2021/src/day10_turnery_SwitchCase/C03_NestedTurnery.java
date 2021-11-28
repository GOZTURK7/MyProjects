package day10_turnery_SwitchCase;

import java.util.Scanner;

public class C03_NestedTurnery {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// her seferinde scanner oluşturmak yerine 
		// test datalarımızı variable olarak da oluşturabiliriz
		// ve kod yazımı bittiğinde bu test datalarını değiştirerek kodlarımızı test edebiliriz.
		
		char cinsiyet = 'E';
		int yas = 71;
			
		
		String sonuc = cinsiyet == 'K' ? (yas > 60 ? "Emekli Olabilirsin" : "Emekli Olamazsın") : 
						  (yas >=65 ? "Emekli Olabilir" : "Emekli Olamazsın");
		
		System.out.println(sonuc);
		scan.close();
	}

}
