package day39_overridingKuralları_Polymorphism;

public class Test04 extends Soru4 {

	


		protected final void getDetails() {
			System.out.println("Test Class");
		}
	
		
		
		public static void main(String[] args) {

			
			Soru4 obj = new Test04();
			obj.getDetails();
			
		}
		
}
