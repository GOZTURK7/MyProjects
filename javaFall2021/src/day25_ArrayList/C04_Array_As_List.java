package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_Array_As_List {

	public static void main(String[] args) {


		//verilen bir arrayi Arrays class'ından yardım alarak list'e çevirebiliriz.
		
		
		String arr[]= {"A", "b", "C", "d"};
		
		
		List<String> arraydenList =Arrays.asList(arr);
		
		
		System.out.println(arraydenList);
		
		// arraydenList.add("F"); // RTE
								// CTE olması için syntax'te bir hata olması lazım ancak bu yazımda 
								// syntax hatası yok.
		// bbu şekilde Arrays class'ından yardım alarak array'i list'e çevririsek oluşturduğumuz 
		// list'in boyutu sabit olur dolayısıyla add(), veya clear() gibi methodları çalıştırmak
		//istersek UnsupportedOperationException hatası verir.
		
		
		arr[1]="Z";
		System.out.println("Array'i değiştirdikten sonra array: " + Arrays.toString(arr));
		System.out.println("Array'i değiştirdikten sonra, list: " + arraydenList);
	
		
		arraydenList.set(3, "D");
		System.out.println("List'i değiştirdikten sonra array: " + Arrays.toString(arr));
		System.out.println("List'i değiştirdikten sonra, list: " + arraydenList);
	
		
	}

}
