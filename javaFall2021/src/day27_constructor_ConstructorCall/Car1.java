package day27_constructor_ConstructorCall;

public class Car1 {

	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;

	public Car1(int i) { // Bu satırdaki int km ile class level'daki int km farklı scope'lardadır.

		km = i;

	}

	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {

		// atama yapacağımız tüm özellikleri parametre olarak yolladık.

		// Ben 5 özelliği birden değiştiren bir constructor orettiğimde
		// java default constructor'ı otomatik olarak siler.
		// bu durumda daha önceden yazılan ve default constructor'ı kullanan tüm kodlar
		// çöker
		// bu durumda kodları düzeltmek için javanin sildiği default constructor yerine
		// parametresiz bir constructor oluşturmalıyom

	}

	public Car1() {
		// TODO Auto-generated constructor stub
	}
	// parametresiz constructor üretmenin syntax'i classAdi+() + {}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
