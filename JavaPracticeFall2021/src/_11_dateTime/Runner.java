package _11_dateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String islem;
		
		registiration userReg = new registiration();
		ArrayList<User> register = null;
		
		boolean cikilsinMi=false;
		while(!cikilsinMi) {
			
			System.out.println("Lütfen \nKişi eklemek için --> 1\nKisi listelemek için --> 2\nŞanslı kişiyi bulmak için --> 3\nÇıkış için --> 4 giriniz");
			islem = scan.next();
			switch(islem) {
			case"1":
			register= (ArrayList<User>) userReg.register();
				break;
			case"2":
				userReg.listele(register);
				break;
			case"3":
				userReg.printHappyUsers(register);
				break;
			case"4":
				cikilsinMi=true;
				break;
			default:
				System.out.println("hatali veri girdiniz.");
				break;
		
			}
		}
		

		
		
		
		
		
		
		
	}

}
