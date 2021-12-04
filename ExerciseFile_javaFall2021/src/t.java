import java.util.Scanner;

public class t {
	static String cardNo = "1";
	static String password = "1";
	static int bakiye = 2000;
	private static boolean flag = true;


	public static void main(String[] args) {	

			String kartNumarası = "";
			String sifre = "";

			do {
				Scanner scan = new Scanner(System.in);

				System.out.println("Lütfen Kart Numaranızı Giriniz: ");
				kartNumarası = scan.nextLine().replaceAll("\s", "");

				System.out.println("Lütfen Şifrenizi Giriniz: ");
				sifre = scan.next();

			} while (!(kartNumarası.equals(cardNo) || !(sifre.equals(password))));

		
		
	}

}
