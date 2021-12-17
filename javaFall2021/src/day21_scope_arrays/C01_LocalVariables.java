package day21_scope_arrays;

public class C01_LocalVariables {
	
	String okulIsmi;

	public static void main(String[] args) {

		/*
		 * Java local variable'lara default değer ataması yapmaz.
		 * kodlarınızda sorun yaşamamak için oluşturduğumuz local variable'lara uygun 
		 * bir değer atamamızda fayda var.
		 */
		int sayi =0; // int sayi; dersek java CTE veriyor.
		System.out.println(sayi);
		
		
		
		//int sayi; // bir localde aynı isimde birden fazla variable OLUŞTURULAMAZ.
		//string sayi; // data türü farklı olsa da java buna izin vermez.
		
		
		@SuppressWarnings("unused") // ben bunun kullanılmadığını biliyorum diyoruz ve sarı çizgi siliniyor.
		String isim="Ali";

		
		
	}

	public static void staticMethod() {
		//sayi; // bir lokalde oluşturulan variable 
				//(methodların static olup olmamasına bağlı olmakszın)
				//farklı lokalde kullanılamaz
			
		@SuppressWarnings("unused") // ben bunun kullanılmadığını biliyorum diyoruz ve sarı çizgi siliniyor.
		String isim="Veli";
		
		
		
		
		
	}
	
	
	
	
	
}
