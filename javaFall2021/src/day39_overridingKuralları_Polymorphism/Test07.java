package day39_overridingKuralları_Polymorphism;

public class Test07 extends Soru7 {
	
	
	public Integer getLength() {
		return 5;
	}

	public static void main(String[] args) {


		Soru7 sooper = new Soru7();
		Test07 sub = new Test07();
		System.out.println(sooper.getLength().toString() + ", "+ sub.getLength().toString());
		
		
		sooper=sub;
		System.out.println(sooper.getLength().toString());
	
	}

}
