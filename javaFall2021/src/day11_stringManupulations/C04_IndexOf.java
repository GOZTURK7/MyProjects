package day11_stringManupulations;

public class C04_IndexOf {

	public static void main(String[] args) {

	// parametre olarak girilen bir char veya strign in 
		// ilk indexini verir
		
		String str = "Calısırsanız , java Ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('j'));

		int index = str.indexOf('r'); // indexof() methodu bize her zaman int bir değer döner
		System.out.println(index); // 6

		
		System.out.println(str.indexOf('q')); // bu char olarak q harfi olmadığı için index değeri -1 geliyor
		// bunun nedeni bir string içinde olmayan bir karakter veya string (kelime) ararsak java -1 döndürür
		// bunun nedeni q yoksa null dönmesi lazım ama index variable integer olduğu için java bunu -1 döndürüyor.

		System.out.println(str.indexOf("java"));

		System.out.println(str.indexOf('e', 15)); // 23 15'den sonra 15 dahil gelen e'nin indexini yazdırıyo
		
		
		System.out.println(str.indexOf("va og")); // aradığımız kelime anlamlı veya anlamsız
		// bir kelime olabilir bu durumda java aradığımız CS'i tek bir paket gibi düüşnür
		// ve o paketin başlangıç index'ini bize int olarak döndürür.
		
		System.out.println(str.indexOf('s'));



		
	}

}
