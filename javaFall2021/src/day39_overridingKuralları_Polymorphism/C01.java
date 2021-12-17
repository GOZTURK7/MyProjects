package day39_overridingKuralları_Polymorphism;

public class C01 {

	
	public static void staticMethod() {
		System.out.println("Parent class static method çalıştı.");
	}
	
	private void privateMethod() {
		System.out.println("Parent Class Private Method Çalıştı.");
	}
	// final demek bu son hali bir daha değiştirilemez demektir dolayısıyla final
	// olarak tanımlanan bir method override edilemez.
	public final void finalMethod() {
		System.out.println("Parent Class Final Method Çalıştı.");
	}
	
	/*	Child ile parent class aynı package'de olduklarından Methodların
	 * 	access modifier'ları public, protected veya default olsaydı hiçbir sorun olmazdı.
	 * 	
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
}
