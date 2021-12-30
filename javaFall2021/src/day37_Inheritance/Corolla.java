package day37_Inheritance;

public class Corolla extends Toyota{
	
	
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";

	public static void main(String[] args) {

		
		Corolla                  arb1           = new           Corolla();
//class ismi && data türü 		obje ismi		keyword			Constructor
		
		// Java'da obje oluşturduğumuz her class ismi aynı zamanda bir data türüdür.
		// Bu örneğimiz için Corolla hem class adı, hem de oluşturduğumuz orb1 ojesinin data type'ıdır.
		// Java'da obje üretilen herbir class aynı zamanda non-primitive data türü olur.
		
		System.out.println(arb1.calisiyorMu); //true
		System.out.println(arb1.tekerSayisi); // 4
		System.out.println(arb1.uretimYeri); // Turkiye

		

		Toyota arb2 = new Corolla();	
		System.out.println(arb2.calisiyorMu); // true;
		System.out.println(arb2.tekerSayisi);// 0 burada arb2'nin data türü Toyota olduğu için Toyota class'ındaki tekerSayisini getirdi.
		
		Araba arb3 = new Corolla();
		System.out.println(arb3.calisiyorMu); // burada data türü araba olduğu için sadece Araba Class'ındakileri görebiliyoruz.
		
		arb1.method1();;
		arb1.method2();
		arb2.method1();;
		arb2.method2();
		arb3.method1();
		
		
	}

}
