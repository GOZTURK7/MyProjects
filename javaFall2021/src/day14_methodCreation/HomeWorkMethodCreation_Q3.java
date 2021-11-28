package day14_methodCreation;

import java.util.Scanner;

public class HomeWorkMethodCreation_Q3 {

	public static void main(String[] args) {
		/*
		 Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
			- @ isareti icermiyorsa gecersiz email yazdirin
			- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
			- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen gmail adresinizi giriniz: ");
		String email = scan.next();
		
		isEmailCorrect(email);
		scan.close();
	}

	public static void isEmailCorrect(String email) {
		if (!email.contains("@")) {
			System.out.println("geçersiz email.");	
		}
		else if (!email.contains("@gmail.com")) {
			System.out.println("Lütfen gmail adresinizi giriniz.");	
		}
		else if (email.indexOf("@gmail.com") !=  (email.replace("@gmail.com","").length())){
			System.out.println("yazımda sorun var maili kontrol edin");	

		}else {
			System.out.println("E-mailiniz: " + email + "başarıyla kaydedildi");	
		}
		
	}

}
