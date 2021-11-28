package day08_IfElseStatements;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yaşınızı giriniz : ");
		int yas = scan.nextInt();
		
		if (yas < 65){
			System.out.println("Yaşınız " + yas +" 65'ten küçük emekli olamazsınız");
		} else {
			System.out.println("Yaşınız " + yas +" 65'ten büyük emekli olabilirsiniz");

		}
		scan.close();
	}

}
