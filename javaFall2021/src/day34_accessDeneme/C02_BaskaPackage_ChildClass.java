package day34_accessDeneme;

import day34_accessModifier_Encapsulation.C01;

public class C02_BaskaPackage_ChildClass extends C01 {

	public static void main(String[] args) {

		C01 obj = new C01();
		
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);
		//System.out.println(obj.sayiProtected); // main method'dan ulaşamazsınız sebebi static klubü ile ilgili
		//System.out.println(obj.sayiPublic);
		
		
		
		
	}
	
	
	public void staticOlmayanMethod() {
		C01 obj = new C01();

		//System.out.println(obj.sayiDefault);
		
		
		//System.out.println(obj.sayiProtected); 
		/*
											BU CLASS'DA sayiProtected DİYE BİR VARİABLE OLMADIĞI HALDE,
											PARENT CLASS'DA VAR OLDUĞU İÇİN JAVA PROBLEM YAPMADI.
											*/
		
		System.out.println();
		
		
	}
	
	
	

}
