package day26_forEachLoop_Constructor;

public class Car {

	/*
	 * Java biz bir class oluşturduğumuzda o calss'tan obje üreteceğimizi bilir ve her class'a default bir
	 * constructor yerleştirir. Java'nın class'a koyduğu bu default constructor görülmez ama obje üretmek 
	 * üzere kod yazdığımızda otomatik olarak devreye girer.
	 * 
	 * 
	 * bir constructor oluşturmak çok kolaydır.
	 * method'a benzer ama method'dan farklıdır.
	 * 	1-	Constructor ismi class ismi ile aynı olmalıdır
	 *  	Class isimleri büyük harfle başladığı için constructor ismi de büyük harfle başlar
	 *  	(method'dan birinci farkı budur, method'lar küçük harfle başlar)
	 *  2- Constructor'ları "return type"'ı olmaz. (bu da method'dan ikinci farkı budur)
	 *  
	 */

	 public Car() {
		
	}// Javanın her class içinde oluşturduğu constructor budur.
	
	
	
	public int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	

	/*
	 * Bugün itibariyle class'larda main method olma mecburiyeti kaldırılmıştır :)
	 * ancak bildiğimiz gibi main method olmayan bir class direk çalıştırılamaz.
	 * Main method'u olmayan class'lar başka class'lardan obje oluştrularak kullanılmak üzere
	 * ihtiyaç duyulan VARİABLE ve METHOD'ları sakladığımız BİR DEPO GİBİDİR.
	 */
	
	

}
