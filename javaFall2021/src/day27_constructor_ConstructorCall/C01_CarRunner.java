package day27_constructor_ConstructorCall;

import day26_forEachLoop_Constructor.Car;

public class C01_CarRunner {

	public static void main(String[] args) {


		// Dünkü Car1 class'ından bir obje oluşturmak istediğimizde 
		// java Car1 class'ını içinde bulunduğumuz class'a import etmek ister.
		
		
		Car car = new Car();
		System.out.println(car.yil);
		// ancak başka package'da olduğu için içinde olduğumuz class'dan 
		// Car class'ındaki variable'lara ulaşabilmem için variable'ın access modifier'i
		//public olmalıdır.
		
		Car1 car1 = new Car1();
		System.out.println(car1.km + " "+car1.model + " "+car1.renk+ " "
				+car1.yil + " "+car1.satilikMi); // 0 null null 2000 false


		car1.km=75000;
		car1.model="Corolla";
		car1.renk="Kırmızı";
		System.out.println(car1.km + " "+car1.model + " "+car1.renk+ " "
				+car1.yil + " "+car1.satilikMi); // 75000 Corolla Kırmızı 2000 false

		
		
		Car1 car2 = new Car1();
		System.out.println(car2.km + " "+car2.model + " "+car2.renk+ " "
				+car2.yil + " "+car2.satilikMi); //0 null null 2000 false


		
		
		Car1 car3 = new Car1();
		car3.km=40000;
		car3.satilikMi=true;
		System.out.println(car3.km + " "+car3.model + " "+car3.renk+ " "
				+car3.yil + " "+car3.satilikMi); // 40000 null null 2000 true

		
		
	}

}
