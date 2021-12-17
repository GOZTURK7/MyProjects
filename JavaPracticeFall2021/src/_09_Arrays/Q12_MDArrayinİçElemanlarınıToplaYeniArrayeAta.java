package _09_Arrays;

import java.util.Arrays;

public class Q12_MDArrayinİçElemanlarınıToplaYeniArrayeAta {

	public static void main(String[] args) {
	//Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların 
	//toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
	// ve yeni array’i ekrana yazdıran bir program yazınız  
	// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
			
		
		int arr1 [][]= { {1,2,3}, {4,5}, {6,7} };
		
		int arr2 []= new int[arr1.length];
		
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr1[i].length; j++) {
				
				arr2[i]+=arr1[i][j];
				
			}
			
		}System.out.println(Arrays.toString(arr2));
		
		
	}
}
