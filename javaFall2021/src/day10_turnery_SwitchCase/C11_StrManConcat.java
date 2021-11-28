package day10_turnery_SwitchCase;

public class C11_StrManConcat {

	public static void main(String[] args) {
		// String olarak verilen bir değişken + ile başka bir 
		// değişkenle işleme sokulursa java bunları yan yana ekler
		// buna "Concatenation" denir.
		
		String isim = "Ali";
		
		String soyIsim = "Can";
		
		System.out.println(isim + " " + soyIsim);
		
		
		// ayni işlemi + sembolu yerine concat () ile de yapabiliriz.
		
		System.out.println(isim.concat(soyIsim)); // AliCan
		
		System.out.println(isim.concat(" ").concat(soyIsim)); // Ali Can
	}

}
