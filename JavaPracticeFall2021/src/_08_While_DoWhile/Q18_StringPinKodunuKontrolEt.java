package _08_While_DoWhile;

import java.util.Scanner;

public class Q18_StringPinKodunuKontrolEt {
    public static void main(String[] args) {

        //TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

    	Scanner scan = new Scanner(System.in);
		

		String systemPin="javacanlara selam olsun";
		int girisHakki=3;
		
		while(true) {
			System.out.println("Lütfen pin numaranızı giriniz.");
			String kullaniciPin=scan.nextLine();
			if(kullaniciPin.equals(systemPin)) {
				System.out.println("gayet başarılı");
				break;
				
			}else {
				System.out.println("Hatalı giriş yapıldı");
				girisHakki--;
				System.out.println("Kalan deneme hakkınız: " +girisHakki);
				if(girisHakki==0) {
					System.out.println("hakkınız kalmadı.");
					break;
				}
			}
		}
		
    }


}
