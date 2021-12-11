package Projects_01_Sanslı_Kullanıcı_Kendim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Registiration kullaniciReg = new Registiration();
		
		boolean isFinish = false;
		while (!isFinish) {
			

			System.out.println("Lütfen \nKişi eklemek için --> 1" + "\nKisi listelemek için --> 2"
					+ "\nŞanslı kişiyi bulmak için --> 3" + "\nÇıkış için --> 4 giriniz");
			String Islem = scan.next();
			switch (Islem) {
			case "1":
				kullaniciReg.register();
				break;
			case "2":
				kullaniciReg.listele(kullaniciReg.kullanicilar);
				break;
			case "3":
				kullaniciReg.printHappyUsers(kullaniciReg.kullanicilar);
				break;
			case "4":
				isFinish = true;
				System.out.println("GÜle Güle....");
				break;
			default:
				System.out.println("Yanlış giriş yaptınız.");
			}

		}

	}

}
