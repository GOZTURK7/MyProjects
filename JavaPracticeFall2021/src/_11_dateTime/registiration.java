package _11_dateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class registiration {

	ArrayList<User> kullanicilar = new ArrayList<>(); // Veri int den yada strinden degil user clasindan gelecek
	
	
	public List<User> register (){

		Scanner scan = new Scanner(System.in);
		System.out.println("adinizi giriniz: ");
		String isim = scan.nextLine();
		
		User user = new User(isim, LocalDateTime.now());
		kullanicilar.add(user);
		return kullanicilar;
	}
	
	public void printHappyUsers(ArrayList<User> users) {
		
		for (User each : users) {
			
			if (each.registerDate.getSecond()<10) {
				
				System.out.println("Şanslı kişisiniz" + each.name + " agam 5 kilo bal kazandın");
				
			}else {
				System.out.println("malesef" + each.name + " bey ballar balını buldunuz konvanınız yağmalandı.");

			}
		}
		
	}
	
	public void listele (ArrayList<User> users) {
		
		for (User each : users) {
			
			System.out.println("Adı: "+each.name+ " Kayıt Zamanı: "+ each.registerDate);
			
		}
		
	}

}
