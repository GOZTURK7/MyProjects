package day27_constructor_ConstructorCall;

public class TirRunner {

	public static void main(String[] args) {
			
		/*
		 * Bir tane tüm özellikleri değiştiren constructor oluşturalım.
		 */
		Tir tir1 = new Tir(5000, "axor", "beyaz", 2020, false); // 		
		// int km, String model, String renk, String yil, boolean satilikMi
		System.out.println(tir1.km + " " + tir1.model+ " "+ tir1.renk+ " "+ 
		tir1.yil+ " " + tir1.satilikMi); // 5000 axor beyaz 2020 false

		
		
		
		// üç özelliği değiştiren bir constructor oluşturalım:
		// int km, String model, String renk
		Tir tir2 = new Tir(12000, "kar", "kırmızı");
		System.out.println(tir2.km + " " + tir2.model+ " "+ tir2.renk+ " "+ 
				tir2.yil+ " " + tir2.satilikMi); //12000 kar kırmızı 2000 false

		
		
		
		
		
	}

}
