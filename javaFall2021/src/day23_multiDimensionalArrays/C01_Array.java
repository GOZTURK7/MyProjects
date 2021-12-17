package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {


		/*
		 * Verilen bir array'den istenen değere sahip elementleri silip kalanı yeni bir array
		 * olarak kaydedin ve sonra yeni array'i yazdırın.
		 */
		
		
		int [] arr= {3,4,5,6,3,5,8,3,4,9};
		
		int silinecekEleman=3;
		
		/*
		 * Array'de yeni eleman ekyemeyiz veya var olan elemanları silemeyiz
		 * çünkü array'in declare edilen uzunluğu değişmez.
		 * 
		 * bu soruda istenilen elementi sildiğimizde geriye kaç element kalıyor bulmamız lazım.
		 */
		
		// silinecek sayı adedini bulalım
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==silinecekEleman) {
				sayac++;
			}
		}System.out.println(sayac);
		int yeniArrayUzunluk=arr.length-sayac;
		int yeniArr[]=new int[yeniArrayUzunluk];
		
		
		// şimdi eski array'deki elemanları birer birer alıp
		// silinecek elemana eşit olmayanları yeni array'e atamalıyız.
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=silinecekEleman) {
				yeniArr[j]=arr[i];
				j++;
			}
			
		}System.out.println(Arrays.toString(yeniArr));
		

		
		
	}

}
