package day20_scope;

public class InstanceVar {

	int notMat = 50;
	int notFen;
	// instance variable'ların scope'unda main method yoktur

	public static void main(String[] args) {

	//	System.out.println(notMat); //Main method static olduğu için static olmayan variable'lar
									// main method'da direk kullanılamaz veya görüntülenemez
		 
		
		
	// instance variable'lara maint method'dan ulaşmak istersek obje oluşturup obje üzerinden 
	// erişim sağlayabiliriz.
		
	// Scanner scan = new Scanner(System.in) mesela burada " 'Scanner Klasından' 'scan' adında, 
		//'new' yeni bir scannerı, class ın içindeki 'Scanner()' constructorı ile oluştur diyoruz işte bu obje oluşturma, eşittir kısmından
		// sonraki new keyword'ü yeni bir obje demek,
		
		
		InstanceVar celil=new InstanceVar();
		System.out.println(celil.notMat); // 50
		
		
		InstanceVar nihal=new InstanceVar();
		nihal.notMat=70;
		System.out.println(nihal.notMat); //70
		

		/*
		 Instance variabler'larda değer atamazsak java instance olarak atanan değeri alır
		 bu class için notMat=50 gibi ama istersek değer de atayabiliriz bu durumda değer 
		 atadığımız obje için yeni değer geçerli olur 
		 */
		
		
		System.out.println(celil.notMat); // 50 tekarar 50 yazdırır çünkü biz 70'i sadece nihal.notMat=70
		// diyerek nihale atadık bu nihal'e özgü celil'in notunu değiştirmek istiyorsak celil.notMat= deyip
		// bir değer atamalıyız.
		celil.notMat=90;
		System.out.println(celil.notMat); //90
		
		
		
		InstanceVar gokhan=new InstanceVar();
		System.out.println(gokhan.notMat); 
		/* burada tekrar 50 görürüz çünkü gokhan objesine bir atama yapmadık sadece value'yu çektik.
		 	
		*/
		
		
		
		//method2(); 
		// method2 static olmadığı için main method'dan direkt çağrılamaz.
		gokhan.method2(); 
		/* bu method2'yi obje üzerinden çalıştırabiliriz ama burada gokhan objesi
		için çalıştıracak
		*/
		
		
		
		

	}

	public static void staticMethod() {
		//System.out.println(notFen); 
		// !!!!!Instance variable'lara static method'lardan direk ulaşılamaz.
		
		
	}

	public void method2() {
		System.out.println(notFen); 
		//  !!!Bu method static olmadığı için Instace variable'lara direkt ulaşabilir.
		// Instance variable oluştururken değer atanmasa da olur bu durumda java default değerler atar
		// integer için default değer 0 dır. Strign için=null, boolean için=false sayısal değerler=0

	}

}
