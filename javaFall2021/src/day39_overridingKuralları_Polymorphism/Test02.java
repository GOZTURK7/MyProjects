package day39_overridingKuralları_Polymorphism;

public class Test02 extends soru2 {
	
	public void getDetails() {
		System.out.println("Test Class");
	}

	public static void main(String[] args) {


		soru2 obj = new Test02();
		obj.getDetails();
	}

}
