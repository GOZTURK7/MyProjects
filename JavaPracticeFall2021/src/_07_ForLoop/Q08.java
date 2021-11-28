package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.

    	Scanner scan = new Scanner(System.in);
    	
    	while(true) {
	    	System.out.print("Lütfen bir string giriniz ,\nÇıkmak için 'esc' yazınız: ");
	    	String str=scan.next();
	    	if(str.equals("esc")) {
	    		System.out.println();
	    		System.out.println("çıkış yapılıyor...");
	    		break;
	    	}
	    	String strReverse="";
	    	
	    	for(int i=str.length(); i>0; i--) {
	    		strReverse+=str.substring(i-1, i);
	    
	    	}
	    	if (str.equals(strReverse)) {
	    		System.out.println();
	    		System.out.println(str + " is a polindrome");
	    		System.out.println();
	    	}else {
	    		System.out.println();
	    		System.out.println(str +" != "+ strReverse + "so it is not a polindrome");
	    		System.out.println();
	    	}
	    	scan.close();
	    	
    	}
    }
  

}

