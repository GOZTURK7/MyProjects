package _09_Arrays;

import java.util.Arrays;

public class Q16_StringdekiRakamlarıİsDigitileBulTopla {
    public static void main(String[] args) {
        /*
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

    	
    	String input="ade1r4d3";
    	
    	String inputArr[]=input.split("");
    	
    	System.out.println(Arrays.toString(inputArr));
    	
    	
    	int toplam=0;
    	for (int i = 0; i < inputArr.length; i++) {
			if (Character.isDigit(inputArr[i].charAt(0))) {
				toplam+=Integer.valueOf(inputArr[i]);
			}else {
				continue;
			}
		}System.out.println("String ifadenin sayı değerleri toplamı: "+ toplam);


    }


}

