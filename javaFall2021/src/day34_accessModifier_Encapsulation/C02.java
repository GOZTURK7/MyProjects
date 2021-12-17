package day34_accessModifier_Encapsulation;

public class C02 {

	public static void main(String[] args) {


		C01 obj = new C01();
		
		//System.out.println(obj.sayiPrivate); PRİVATE VARİABLE'LARA KENDİ CLASS'I DIŞINDAN ULAŞILAMAZ.
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
	}

}
