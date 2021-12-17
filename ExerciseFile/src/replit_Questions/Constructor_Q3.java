package replit_Questions;

public class Constructor_Q3 {

	/*
	 * CONSTRUCTOR Soru 4: Create 2 constructors one is with parameters, the other
	 * one is without parameter. By using that constructors create at least 2
	 * objects then print their features on the console.
	 * 
	 */

	String name;
	String soyAd;
	int yas;

	public Constructor_Q3() {

	}

	public Constructor_Q3(String name, String soyAd, int yas) {
		this.name = name;
		this.soyAd = soyAd;
		this.yas = yas;

	}

	@Override
	public String toString() {
		return "Bilgiler [name=" + name + ", soyAd=" + soyAd + ", yas=" + yas + "]";
	}

	public static void main(String[] args) {

		Constructor_Q3 obj1 = new Constructor_Q3();
		Constructor_Q3 obj2 = new Constructor_Q3("Gökhan", "Öztürk", 33);

		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
