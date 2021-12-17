package day20_scope;

public class StaticVar {

	static int no = 20;
	static int sayi;
	static String adres = "Ankara";
	static String cadde;
	static boolean aktifMi = true;
	static boolean tatildeMi;

	public static void main(String[] args) {

		/*
		 * Static variable'lara main method'dan direk ulaşılabilir mi? EVET. *
		 */
		System.out.println(no); // 20
		no++;
		System.out.println(no); // 21
		
		
		staticMethod();
		
		
	
		StaticVar obje = new StaticVar(); 
		// !!!method static olmadığı için methodu obje ile çağırıyoruz.
		// ancak aşağıdaki static olmayan methodun içinden static variable'a direkt ulaşabiliyoruz.
		// tıpkı static olan methodlardaki gibi.
		obje.staticOlmayanMethod();

	}
	
	
	

	public static void staticMethod() {
		/*
		 * Instance variable'lara static method'dan direk ulaşılabilir mi? EVET.
		 */
		no++;
		System.out.println("static method'da 'no' :" + no);
		/*
		 * Static Variable'larda yapılan değişiklikler kalıcı olarak değişiyor ve diğer
		 * kullanılan her yerde bir işlem yapılacaksa bu değişiklik oraya yansıyor yansıyor
		 * Instance'da ise sadece atadığımız objeye assign ediliyor 
		 */

	}

	public void staticOlmayanMethod() {
		/* 
		 * Static variable'lara static olmayan method'dan direk ulasilabilir mi ? EVET
		 * 
		 * !!!!Static variabler'lara static olan veya olmayan tüm methodlardan ulaşılabilir.
		 * bu yüzden static variable'lara class variable da denir
		 */
		no++;
		System.out.println("static method'da 'no' :" + no);

	}

}
