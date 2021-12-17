package day28_constructorCall_StaticKeyword;

public class C03 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	
		/*
		 * NOTE: run time bir programdır.
		 * 		 run tuşuna bastığımızda java çalışmaya başlar ve işlemleri yapar.
		 * 		 Javanın isi bitiğinde (çalışma tuşu kırmızıdan griye döndüğünde) herşey başa döner.
		 * 
		 * 
		 * NOTE: Static variable ve method'lar bulundukları class ile ilintilidir (Obje ile değil class ile)
		 * 		 başka bir class'dayken C02'deki static variable veya method'a ulaşmak istediğimizde C02.staticVariableIsmi() 
		 * 		 ve C02.staticMethodIsmi() yazmamız yeterli
		 * 
		 */
		
		
		C02 obje1 = new C02();
		System.out.println("obje1 için x :" + obje1.x + " obje1 için y: " + obje1.y);
	
		obje1.x++;
		obje1.y++;
		/* Static bir variable'a class ismi üzerinden ulaşmak yerine
		 * Instance variable'lar gibi obje ile ulaşmaya çalışırsanız
		 * Java CTE vermez ama solda ! işareti ile bizi uyarır.
		 * Static bir field olan C02.y'ye static yoldan ulaş der. 
		 */
		System.out.println("obje1 için x :" + obje1.x + " obje1 için y: " + obje1.y);
		
		
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
