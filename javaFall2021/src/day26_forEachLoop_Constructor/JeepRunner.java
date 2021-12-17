package day26_forEachLoop_Constructor;

public class JeepRunner {

	public static void main(String[] args) {

		// Jeep class'ından bir obje oluşturalım ve özelliklerini yazdıralım.
		
		Jeep jeep1 = new Jeep();
		
		System.out.println(jeep1.fiyat + " "+jeep1.ilanNo + " "+jeep1.marka+ " "
		+jeep1.model + " "+jeep1.yil); //10000 1001 null null 2001

		
		/*
		 * Jeep class'ındaki instance variable'lar olduklarından atadığım değerler
		 * sadece benim objemiçin değerleri değiştirir. 
		 * Jeep class'ındaki değerlere hiçbir şey yapmaz.
		 */
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.yil=2005;
		
		jeep1.hız(50); //Araba saatte 50 km yapar.
		jeep1.yakit("Benzin"); // Araba yakit olarak Benzin kullanır.
		
		System.out.println(jeep1.fiyat + " "+jeep1.ilanNo + " "+jeep1.marka+ " "
				+jeep1.model + " "+jeep1.yil); //15000 1002 Toyota Corolla 2005

		
		

	}

}
