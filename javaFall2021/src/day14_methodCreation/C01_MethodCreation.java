package day14_methodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {

		/*
		 Verilen iki sayının toplamını ve çarpımı yapıp yazdıran iki ayrı method oluşturun.
		 
		 */
		
		
		/*
		 method oluşturmak için 4 adım takip edelim
		 	1- method call yazalım
		 	2- method'a arguman yazacak mıyız karar vermeliyiz.
		 	3- birinci ve ikinci adımı yaptıktan sonra javadan yardım alıp methodu oulştururuz
		 	4- erişim düzenleyici ve return type'a karar vermeliyiz.
		 	
		 */
		
		
		int sayi1 = 4;
		int sayi2 = 5;
		carpma(sayi1, sayi2);
		toplama(sayi1, sayi2); // 1- method call 2- arguman yazımı
		
		// 3. adım birinci ve ikinci adımı yaptıktan sonra javadan yardım alıp methodu 
		
		
		carpma(sayi1, sayi2);
		
		
		
	}

	public static void carpma(int sayi1, int sayi2) {

		System.out.println("Sayıların çarpımı " + (sayi1 * sayi2));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		/* 4- erişim düzenleyici ve return type'a karar vermeliyiz.
		 erişim düzenliyici acces modifier: public yaptık
		 return type: bizden sadece yazdırma istediği için void kalabilir
		 */
		System.out.println("Sayıların toplamı " + (sayi1 + sayi2));
	}

}


