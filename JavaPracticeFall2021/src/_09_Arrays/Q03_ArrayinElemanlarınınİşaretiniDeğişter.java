package _09_Arrays;

import java.util.Arrays;

public class Q03_ArrayinElemanlarınınİşaretiniDeğişter {

    public static void main(String[] args) {
        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6


    	int arr []= {1,2,-3,4,-5,-6};
    	
    	cevir(arr);	
    	
    }

	private static void cevir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]=array[i]*-1;
		}
    	System.out.println(Arrays.toString(array));		
	}


}
