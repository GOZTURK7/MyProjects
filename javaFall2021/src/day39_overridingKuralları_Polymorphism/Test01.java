package day39_overridingKuralları_Polymorphism;

public class Test01 extends Soru1{

	public void getDetails(String temp) {

		System.out.println("Test class : " + temp);

	}

	public static void main(String[] args) {

		Test01 obj = new Test01();
		obj.getDetails("GFG");

	}

}
