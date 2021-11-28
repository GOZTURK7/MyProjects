package day26_forEachLoop_Constructor;

public class CarRunner {

	public static void main(String[] args) {


		// car class'ından bir obje oluşturalım.
		
		
			Car          car1         =         new          Car ();
	//  class ismi	   obje ismi    atama     keyword      Constructor
		
		
		
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " "+ car1.yil); // 0 null null 2000
		
		
		// bir obje oluştururken eğer obje için kendi class'inda belirlenen değerleri kullanmak istiyorsam
		// hiçbir değeri kendim atamadan obje oluşturabilirim. Bu durumda hiçbir parametre kullanılmadığı için
		// default constructor yeterli olacaktır.
		
		
		/*
		 * Eğer obje oluşturduğum class'daki değerleri kullanmak yerine kendi değerlerimle bir obje oluşturmak istersem
		 * o zaman parametreli constructor oluşturmam gerekir.
		 */
		//  Car1 car2 = new Car1("Kirmizi", "Corolla");  Car1 Class'ında iki String parametresi olan bir constructor olmadığı
		// için bu obje oluşturmayı şimdilik yapamayız. 
		
	}

}
