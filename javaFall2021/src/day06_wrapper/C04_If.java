package day06_wrapper;

public class C04_If {
	
	public static void main (String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		if (a>5) {
			System.out.println("a' sayısı besden büyük");
			
		}
		
		
		if (a>b) { // if statement false olduğundan yazdırmayacak ama kod arkada çalışıp alt satıra geçecek.
			System.out.println("a sayısı b den büyük"); 
			
		}
		
		if (b>100) { // buraya gelince yine if statement' a bakıyor şart sağlanmadığı için yazdırmayacak ama kod çalışacak 
			System.out.println("b sayısı 100 den büyük"); 
		}

		
		// BASİT İF CÜMLELERİ BAĞIMSIZ ÇALIŞIR HER BİR İF CÜMLESİ KENDİ ŞARTINA BAKAR ŞART TRUE İSE
		// BODY ÇALIŞIR ŞART FALSE İSE BODY ÇALIŞMAZ.
		// şart (condition) kodu çalışır eğer true ise body(curly braces) içindeki syso veya işlem gerçekleşir yoksa olmaz.
				
		
	}
	

}
