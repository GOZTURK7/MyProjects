package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {


		/*
		 * Verilen sayıları toplayan bir method oluşturmak istiyorum.
		 * 
		 */
		
		int a = 10;
		int b = 30;
		int c = 30;
		int d = 40;
		int e = 50; 
		
		topla(a, b);
		topla(a, b,c);
		topla(a, b, c, d);
		//topla(a, b, c, d, e);// parametre sayısını dinamik yapmak için varargs kullanıyoruz.
		
		/* Şu ana kadar gördüğümüz tekniklerle değişken sayıda parametreli tek bir method oluşturamayız
		 * 
		 */

		
	}

	private static void topla(int ... sayı) {
		System.out.println("varrargs çalışır");
	}

//	private static void topla(int a, int b, int c) {
//		System.out.println("iki sayının toplamı : "+(a+b+c));
//	}

}
