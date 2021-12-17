package halukHoca;

import java.util.Scanner;

public class Method_Creation_Q04 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true 
         * degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

    	Scanner scan = new Scanner(System.in);

		System.out.println("lütfen bir string giriniz");
    	String str = scan.next();
    	
    	
    	xyzVarMi(str);
    	
    	
    	
    }

	public static boolean xyzVarMi(String str) {

		if (str.contains("x") || str.contains("y") || str.contains("z")) {
			return true;
	
		}else {
			return false;
		}
	}

}
