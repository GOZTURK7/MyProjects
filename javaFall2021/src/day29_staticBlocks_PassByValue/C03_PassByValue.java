package day29_staticBlocks_PassByValue;

public class C03_PassByValue {

	public static void main(String[] args) {

		/*
		 * MAİN METHDO'DAN DİĞER METHODLARA VEYA DİĞER METHODLARDAN MAİN METHOD'A BİR VAARİABLE
		 * GÖNDERİRSENİZ JAVA ORJİNAL VARİABLE'LARI DEĞİL ONLARIN DEĞERLERİNİ (VALUE) GÖTÜRÜR.
		 * ORİJİNAL VARİABLE'IN DEĞERİ DEĞİŞMEZ.
		 * 
		 * Biz 100 tl'ye satılan bir ürün için 2 farklı indirim uygulayan iki method
		 * oluştaralım.
		 */

		int fiyat = 100;

		// indirimYap25(fiyat); // bize 75 değerini bize döndürür şimdi burada assign
		// yaparsak o zaman fiyat variable'ını kalıcı olarak değiştiririz.
		// ama C02 clasındaki gibi sadece indirimYap25(int fiyat) methodunda işlem yapıp
		// void ile yazdırırsam o zaman int fiyat'ın copy'si üzerinde
		// işlem yaptığımdan main'deki variable fiyat kalıcı olarak değişmez.

		fiyat = indirimYap25(fiyat); // işte buradaki atama main method'daki fiyat variable'ını kalıcı olarak
										// değiştiriyor.
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);
		indirimYap10(fiyat);
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);

	}

	private static int indirimYap25(int fiyat) {
		fiyat *= 0.75;

		return fiyat;
	}

	private static int indirimYap10(int fiyat) {

		fiyat *= 0.90;

		return fiyat;

	}

}
