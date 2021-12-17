package day30_immutableClasses;

public class C02_ImmutableClasses {

	public static void main(String[] args) {


		String str = "Ali";
		
		for (int i = 0; i < 100; i++) {
			
			str+= " ";
		}
		
		/* Bu kod çalıştığında java kaç obje oluşturur?
		 * 100 tane döngüden 1 obje de başta vardı 101 tane obje oluşturulur.
		 * Bu da hafızayı kasar o yüzden ileride göreceğiz StringBuilder Class'ı
		 * ile string kullanmak daha iyi çünkü StringBuilder mutable ve arkasında
		 * hiç ölü bırakmaz :)
		 * 
		 */
		
		
	}

}
