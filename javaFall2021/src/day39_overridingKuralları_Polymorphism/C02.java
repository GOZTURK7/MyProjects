package day39_overridingKuralları_Polymorphism;

public class C02 extends C01 {

	public static void main(String[] args) {


		C02 obj1 = new C02();
		
		obj1.privateMethod();
		obj1.staticMethod();
		
		
		C01 obj2 = new C02();
		//obj2.privateMethod();  
		// DATA TÜRÜ C01 OLDUĞUNDAN ÖNCELİKLER C01 CLASSINDAKİ METHODA BAKMAMIZ GEREKİR ANCAK PRİVATE OLDUĞUNDAN
		// ULAŞAMAYIZ. ULAŞAMADIĞIMIZ BİR METHODU OVERRİDE YAPAMAYIYZ. DOLAYISIYLA SİGNATUR OLMASINA RAĞMEN BU İKİSİ
		// FARKLI İKİ METHOD OLARAK ÇALIŞIR.
		obj2.staticMethod();
		
		
		
		
	}
	public static void staticMethod() {
		System.out.println("Child class static method çalıştı.");
	}
	
	private void privateMethod() {
		System.out.println("Child Class Private Method Çalıştı.");
	}
	
//	public final void finalMethod() {
//		System.out.println("Parent Class Final Method Çalıştı.");
//	}
}
