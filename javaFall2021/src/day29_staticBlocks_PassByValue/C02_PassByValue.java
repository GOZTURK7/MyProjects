package day29_staticBlocks_PassByValue;

public class C02_PassByValue {

	public static void main(String[] args) {


		/*
		 *Bunu bir de adres bulma analojisinden izah edebilirim. Ornegin sana bir kagit verdim, kagitta evimin adresi yaziyor.
			Sen bu kagidin uzerindeki adresi silip, yerine baska bir evin adresini yazarsan:
			- Bu kagida bakarak benim evin adresini bulmak isteyen tum insanlar artik yeni evin adresini gorurler. Cunku sen direkt olarak referansi degistirdin.
			- Benim adresimin bulundugu kagidin sana sadece bir kopyasini verdim, sen ona istedigini yaz. Sadece kendi baktigin adresi degistirirsin, diger herkes ayni sekilde benim evimin adresini okumaya devam ederler. ---> Pass by value budur.
			Eger sen evin icerisinde bir sey degistirmek istersen, adresteki evi bulup, icerisinde istedigin degisikligi yapabilirsin. Ama sana verdigim kagida ne yazarsan yaz, diger insanlarin referansi uzerinde degisiklik yapamadigin icin senin disindaki insanlar ( scope disindakiler ) etkilenmezler.
			Collapse





		 * 
		 * 
		 * 
		 * 
		 * Biz 100 tl'ye satılan bir ürün için 2 farklı indirim uygulayan iki method oluştaralım.
		 */
		
		
		int fiyat = 100;
		
		//indirimYap10(fiyat);
		indirimYap25(fiyat);
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);
		indirimYap10(fiyat);
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);



	}

	private static void indirimYap25(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat : " + fiyat);		
	}

	private static void indirimYap10(int fiyat) {

		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat : " + fiyat);
	}

}
