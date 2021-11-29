package day28_constructorCall_StaticKeyword;

public class C02 {
	int x=5;
	static int y=10;
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
 // 3 tane obje oluşturalım ve değişimleri gözlemleyelim
		
		
		C02 obje1 = new C02();
		System.out.println("obje1 için x :" + obje1.x + " obje1 için y: " + obje1.y);
	
		obje1.x++;
		y++;
		System.out.println("obje1 için x :" + obje1.x + " obje1 için y: " + obje1.y);
		/* Aynı Class içinde ikeyn static variablle'lara ulaşmak için objeye ihtiyaç yoktur
		 * Kullanırsak Java CTE vermez fakat "static variable'a static yoldan ulaş" diye bizi uyarır.
		 * 
		 */
		
		C02 obje2 = new C02();
		System.out.println("obje2 için x :" + obje2.x + " obje2 için y: " + obje2.y);

		obje2.x++;
		obje2.y++;
		System.out.println("obje2 için x :" + obje2.x + " obje2 için y: " + obje2.y);

		System.out.println("obje2 oluştrulduktan ve işlemden sonre obje1'in \nx : " + obje1.x + " ===> y : " + obje1.y);
	
		
		C02 obje3 = new C02();
		
		obje3.x=20;
		obje3.y=40;
		System.out.println("obje3'den sonra obje1'in için x :" + obje1.x); // 6
		System.out.println("obje3'den sonra obje2'in için x :" + obje2.x); // 6
		System.out.println("obje3'den sonra obje3'in için x :" + obje3.x); // 20
		
		System.out.println("obje3'den sonra obje1'in için y :" + obje1.y); // 6
		System.out.println("obje3'den sonra obje2'in için y :" + obje2.y); // 6
		System.out.println("obje3'den sonra obje3'in için y :" + obje3.y); // 20



		
	}

}
