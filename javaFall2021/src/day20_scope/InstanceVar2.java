package day20_scope;

public class InstanceVar2 {

	String adres = "Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt = 12.3;
	char cinsiyet = 'E';
	char karakter;
	boolean ogrenciMi = true;
	boolean izinliMi;

	public static void main(String[] args) {
		/*
		 * Instance variable'lara main method'dan direk ulaşılabilir mi? HAYIR.
		 * Nasıl ulaşılabilir? OBJE OLUŞTURARAK.
		 * 
		 */
		
		InstanceVar2 ali=new InstanceVar2();
		System.out.println(ali.adres); // 'Ankara'
		System.out.println(ali.dogumYeri); // 'null' default olarak.
		System.out.println(ali.notOrtalamasi); // '0.0'
		System.out.println(ali.yasOrt); // '12.3' 
		System.out.println(ali.cinsiyet); // 'E'
		System.out.println(ali.karakter); // ' '(space)
		System.out.println(ali.ogrenciMi); // true
		System.out.println(ali.izinliMi); // false
		
		
		
	}

	public static void staticMethod() {
		/*
		 * Instance variable'lara static method'dan direk ulaşılabilir mi? HAYIR.
		 * Nasıl ulaşılabilir? OBJE OLUŞTURARAK.
		 */

	}

	public void staticOlmayanMethod() {
		// instance variable'lara static olmayan method'dan direk ulasilabilir mi ? EVET

	}
}
