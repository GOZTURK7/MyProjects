package day35_encapsulation_Inheritance;

public class Personel {

	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	Personel(){
		System.out.println("Personel parametresiz constructor çalıştı");

	}
	
	// Eğer variable'lara access modifier yazmazsak 
	// Java access modifier olarak default access modifier atar
	// böyle olursa sadece o package altındaki child class'lar
	// Personel Class'ını inherit edebilir.
	// Başka package'lardaki child class'ların da Personel'i inherit edebilmesi için
	// variable ve methodların access modifier'larını protected yaparız.
	// Public yapsak da inherit edilebilir ama biz herkesin erişmesini değil de 
	// sadece child calss'ların erişmesini istedğimizden protected'ı tercih ederiz.
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
