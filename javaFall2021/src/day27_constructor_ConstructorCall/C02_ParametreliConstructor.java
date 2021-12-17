package day27_constructor_ConstructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {


		/*
		 * Javanın oluşturduğu default constructor ile obje oluşturabiliyoruz ama her obje için yeniden değer
		 * ataması yapmak uzun oluyor istersek parametreli constructor'lar oluşturup daha obje oluşurken istedğim özellikleri 
		 * atayabilirim.
		 */
		
		
		
		Car1 car1 = new Car1(50000, "Vectra", "Beyaz", 2015, true);
		// int km, String model, String renk, String yil, boolean satilikMi
		
		
		Car1 car2 = new Car1(35000);
		
		System.out.println(car2.km);
		
	}

}
