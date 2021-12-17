package day30_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {


		// String immutable bir calssa iken List mutable'dır.
		
		String str = "Ali";
		str.toUpperCase();  // str ==> ALI
		
		System.out.println(str);  // Ali
		
		System.out.println(str.toUpperCase()); // ALI	
		
		
		List<String> isimler = new ArrayList<>();
		
		System.out.println(isimler);
		
		isimler.add("Ali");  // Assign olmadan da isimler listesini değiştirdik işte bu mutable demek
							// ama yukarıdaki örnekte str.toUpperCase() String immutable olduğu için 
							// Heap'te clonladı ve klonun üzerinde uppercase yaptı ama assign olmadığı
							// için havada ve referansı yok yani referansı olan asıl değer hala korunyor.
							// işte bu immutable demek.
		
		System.out.println(isimler); //  [Ali]
		
		
	}

}
