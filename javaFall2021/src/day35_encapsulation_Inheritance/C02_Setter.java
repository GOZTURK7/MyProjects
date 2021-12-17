package day35_encapsulation_Inheritance;

public class C02_Setter {

	public static void main(String[] args) {


		
		// Öğretmenler öğrencinin notunu girebilsin 
		// ama tüm notları göremesin sadece geçip geçemediğini görsün.
		
		
		C01 ogr1 = new C01();

		// default notu 49.9 false dönüyor 50'den küçük olduğu için.
		System.out.println(ogr1.isGecerMi()); // false,
		
		
		
		// burada setter() bize notu değiştirme yetkisi verdiğinden notu 50 yaptığımızda Setter()'ın içindeki 50'den büyük ve 
		// eşitse true dön , komutu çalışıyor ve aşağıda sysout ile yazdırdığımızda bu sefer true dönüyor.
		ogr1.setNot(50);
		
		System.out.println(ogr1.isGecerMi()); // true,
			
		System.out.println(ogr1.getAdSoyad());
	}

}
