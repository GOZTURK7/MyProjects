package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {


		// soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun 
		//bunu yapmiyor muyuz


		
		String arr [] = new String [4];
		
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayse";
		arr[3] = "Fatma";
		
		
		String arr2 [] = {"Ali", "Veli", "Ayse", "Fatma"};
		
		
		//Soru 2: Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin


		arr[0] = "Can";
		arr[2] = "Gül";
		
		
		System.out.println(arr2[1]);
		
		
		
		// Son eleminti yazdırın
		System.out.println(arr[arr.length-1]); // String'deki 'length()' idi, burada sadece 'length'
		
		
		// Array'de olmayan bir şeyi yazdırmak isterseniz
		//System.out.println(arr[arr.length]); //ArrayIndexOutOfBoundsException hatası verecek 
							//çünkü son indeksten bir fazlaki alanı yazdırmak istedik 'length-1' yapmalıydık
		

		
		/*Bir array'in uzunluğu nasıl bulunur . 'arr.length' ile
		 * 
		 */
		
		
	}

}
