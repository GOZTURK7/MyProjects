package day06_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {

		
		
		int sayi1 = 10;
		Integer sayi2 = 20;
		
		
		// sayi1. yazdığımızda hiçbir method çıkmaz çünkü sayi1 int'dir yani "Primitive"'dir.
		// sayi2 yazdığımızda birçok method geliyor çünkü sayi2 Integer'dır yani "Non-Primitive" dir.
		
		
		sayi2.floatValue();
		
		System.out.println(sayi2);
		
		String tel1 = "3578987";
		
		String tel2 = "3245434";
		
		System.out.println(tel1 + tel2); //35789873245434
		
		// bu sayıları toplamak isterseniz (eğer stringininizin içinde matematiksel ifadeler olduğundan eminseniz
		// aşağıdaki şekilde Wrapper Class kullanarak bunları int'e çevirip toplayabiliriz.
		
		System.out.println(Integer.valueOf(tel1) + Integer.valueOf(tel2)); //6824421
		
		
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.MAX_VALUE); // 2147483647
		
		String caddeNo = "B203";
		
		String sokakNo = "1564";
		
		System.out.println(Integer.valueOf(caddeNo) + Integer.valueOf(sokakNo));
		// Integer.valuOf(String numerik ifade) metodu tring olarak kaydedilmiş numerik ifadeleri sayıya çevirir.
		// ancak String ifadede numerik olmayan bir karakter olursa
		// Jaa NumberFormatException hatasi verir ve çalışmayı durdurur.
		// stops execution

		
		
		
	}

}
