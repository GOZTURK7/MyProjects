package day38_overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {

		
		KumesHayvanlari kms1 = new KumesHayvanlari();
		
		kms1.beslenme(); // Tüm hayvanlar beslenir
		kms1.hareket(); // Kumes hayvanları yürüyerek hereket eder
		kms1.solunum(); // Kuşlar akciğerleri ile nefes alır
		
		
		
		Kuslar kms2 = new KumesHayvanlari();
		kms2.beslenme(); //
		kms2.hareket(); // 
		kms2.solunum(); // 
		// kendi spesifik özellikleri dışında kuşlara tabi oluyr
		// ama spesifik bir durumu varsa farkını ortaya koyuyor.
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme();
		kms3.hareket(); // 
		kms3.solunum(); //
		
		
		Animals kms4 = new KumesHayvanlari();
		kms4.beslenme();
		kms4.hareket(); // 
		kms4.solunum(); //
		
		

	}
	
	public void hareket() {
		System.out.println("Kumes hayvanları yürüyerek hereket eder");
	}
	
	
}
