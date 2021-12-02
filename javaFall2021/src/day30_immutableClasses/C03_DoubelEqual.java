package day30_immutableClasses;

public class C03_DoubelEqual {

	public static void main(String[] args) {


		/*	Java'da String iki türlü oluşturulabilir
		 * 		1-  non-Primitive olduğu için 'new' keyword ile;
		 * 
		 * 			Java önce eşitliğin sağına baktığından new kelimesi olduğu için
		 * 			önce obje oluşturur sonra değeri atar. Yani bu oluşturma şeklinde
		 * 			her zaman yeni bir obje oluşur.
		 * 
		 * 		2- Bugüne kadar öğrendiğimiz gibi oluşturursak;
		 * 			String str2 = "Mustafa"; 
		 * 			Burada java eşitliğin sağında olan String değerinin 
		 * 			STRİNG HAVUZUNDA olup olmadığını kontrol eder ve Havuzda aynı değerin olduğu
		 * 			variable varsa onun referansına (öncekinin) yenisini ekle
		 * 
		 */
		
		
		String str1 = "Mustafa";
		String str2 = "Mustafa";
		String str3 = new String ("Mustafa");
		String str4 = new String ("Mustafa");
		
		System.out.println(str1 == str3); // false
		System.out.println(str1.equals(str3)); // true
		
		System.out.println(str4 == str3); // false
		System.out.println(str4.equals(str3)); // true
		
		System.out.println(str1 == str2); // !!!!!!!!!!!!!!  true


		
		
		
	}

}
