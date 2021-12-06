package Projects_01_Sanslı_Kullanıcı_Kendim;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registiration {

	/*
	 * 2- Registration isminde bir class oluşturun ve register isminde bir metod
	 * ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
	 * return edin. 3- Registration classı na aynı zamanda kendine verilen
	 * ArrayListteki userlardan her dakikanın ilk 10 saniyesinde kaydolanları
	 * yazdıran printHappyUsers isminde bir metod daha ekleyiniz.
	 */
	
	
	
	ArrayList<User> kullanicilar = new ArrayList<>();

	public void register() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Adı girin: ");
		String isim = scan.nextLine();
		User kullanici = new User(isim, LocalDateTime.now());
		kullanicilar.add(kullanici);

	}

	public void printHappyUsers(ArrayList<User> kullanicilar) {

		for (User each : kullanicilar) {

			if (each.registerDate.getSecond() < 10) {

				System.out.println(each.name + " Tebrikler Şanslı Kişisiniz 5 Kilo Bal kazandın.");

			} else {

				System.out.println(each.name + " Üzgünüz kaypbettiniz bal mal yok.");

			}

		}

	}

	public void listele(ArrayList<User> kullanicilar) {

		for (User each : kullanicilar) {

			System.out.println("Adı: " + each.name + ", Kayıt Zamanı: " + each.registerDate);

		}

	}

}
