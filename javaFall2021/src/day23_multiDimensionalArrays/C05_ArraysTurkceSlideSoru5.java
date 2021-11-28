package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_ArraysTurkceSlideSoru5 {

	public static void main(String[] args) {


		/*
		 * Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		 */
		

    	System.out.println("Lütfen bir cümle giriniz.");
    	
    	String cumle = "Her sey, Javayla kolay değil mi?";
    	
    	String kelimeler[] = cumle.split(" ");
    	
    	System.out.println(Arrays.toString(kelimeler)); //[Her, sey,, Javayla, kolay, değil, mi?]
    	
    	System.out.println("girilen cümlede " + kelimeler.length + " adet kelime var"); //girilen cümlede 6 adet kelime var

	}

}
