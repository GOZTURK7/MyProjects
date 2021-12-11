package day38_overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {


		Baliklar balik1 = new Baliklar();
		
		balik1.beslenme(); //Tüm hayvanlar beslenir
		balik1.hareket(); // Balıklar yüzerek hereket eder
		balik1.solunum();  // Balıklar solungaçları ile nefes alır
		
		
		
	}
	/* Child class'taki bir method paret class'dan bir methodu override ediyorsa
	 * Bunu @Override notasyonu ile deklare edebiliriz.
	 * Deklare etmesek de kodlarımız çalışır
	 * ancak deklare ettiğimizde java overridden methodu (yani parenttaki methodu) sürekli
	 * kontrol eder o methodda Overriding'e uymayan bir değişiklik olursa CTE verir. 
	 */
	@Override
	public void hareket() {
		System.out.println("balıklar yüzerek hereket eder");
	}
	
	public void solunum() {
		System.out.println("Balıklar solungaçları ile nefes alır");
	}
	
	
	
}
