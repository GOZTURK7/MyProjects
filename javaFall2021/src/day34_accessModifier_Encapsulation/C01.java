package day34_accessModifier_Encapsulation;

public class C01 {

	private int sayiPrivate=10; // PRİVATE CLASS ÜYELERİNE SADECE İÇİNDE BULUNDUĞU CLASS'TAN ULAŞABİLİRİZ.
	
	int sayiDefault=20;			// DEFAULT CLASS ÜYELERİNE SEDCE İÇİNDE BULUNDUĞU PACKAGE'TAN ULAŞILABİLİR.
								// DEFAULT ACCESS MODİFİER'IN DİGER İSMİ DE PACKAGE ACCESS MODİFİER'DIR.
	
	protected int sayiProtected=30; // PROCETCTED CLASS ÜYELERİNE İÇİNDE BULUNDUĞU PACKAGE'DAKİ TÜM CLASS'LAR VE
									// BAŞKA PACKAGE'LARDAKİ CHİLD CLASS'LAR ULAŞABİLİR.
	
	public int sayiPublic = 40; // TÜM PACKAGE'LARDAKİ TÜM CLASS'LARDAN ULAŞILABİLİR.
	
	
	public static void main(String[] args) {


		C01 obj = new C01();
		
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

		
		
	}

	public void staticOlmayanMethod() {
		
		C01 obj = new C01();
		
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
	}
	
}
