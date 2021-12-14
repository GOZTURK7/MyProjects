package day40;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	public static void main(String[] args) {

		// soru : kullanıcıdan yasını girmesini isteyin
		// kodunuzu kullanıcı sıfırdan küçük bir sayı girerse exception verecek sekilde yazın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("konsolda görmek için yasınızı girin");
		
		int yas = scan.nextInt();
		
		try {
			if(yas < 0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println(yas);
			}
			
		}catch(IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas 0'dan küçük olamaz.");
		}
		
	}

}
