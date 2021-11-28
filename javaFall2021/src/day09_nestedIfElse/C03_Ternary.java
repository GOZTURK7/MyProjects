package day09_nestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {


		int x = 10;
		
		String tekMiCiftMi = x%2 == 0 ? "Çift Sayı" : "Tek Sayı";
		
		System.out.println(tekMiCiftMi); // çift
		
		
		System.out.println(x%2 == 0 ? "Çift Sayı" : "Tek Sayı");
		// ternary iki türlü kullanılabilir
			// ya dönen sonuca göre bir variable oluşturup assign ederiz
			// ya da direk syso içine yapız sonucu yazdırırız.
		
		
		
		// eğer ternary de dönecek sonuçlar aynı data türünden değilse 
		// atama yapamayız , sadece syso ile yazdırabiliriz.
		System.out.println(x >5 ? "Aferin" : 4);
		
		//String sonuc = x > 5 "Aferin" : 4;
		
		
		
		
	}

}
