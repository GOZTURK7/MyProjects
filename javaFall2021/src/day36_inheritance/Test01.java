package day36_inheritance;



// BİR SAYFADA İKİ CLASS OLUŞTURMAMIZ ECLİPSE İZİN VERİYOR ANCAK ŞARTI BİRİ PUBLİC DİĞERİ DEĞİL OLMASI LAZIM.


class Derived {
//	public Derived() { // yada buraya bi tane parametresiz super() koyarız.
//		
//	}
	
	public Derived (String temp){
		System.out.println("Test01 Class "+ temp);
	}
	
	
}

public class Test01 extends Derived {
	public Test01(String temp) {
		super(temp);  // Ya buraya bu şekilde parametreli super koyarız hatayı gidermek için, 
		System.out.println("Test class : " + temp);
	}
	
	public static void main(String[] args) {
		
		Test01 obj = new Test01("samet");
	}
	
}

