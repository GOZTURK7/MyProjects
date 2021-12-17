package _09_Arrays;

import java.util.Arrays;

public class Q08_GuzelSoru {

    public static void main(String[] args) {
		
		/*   $ ve  £  isareti olanlarin toplamlarini ayri ayri bulun

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

    	String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
    	String arr []=str.split(" ");
    	Arrays.sort(arr);
    	
    	int toplamDolar=0;
    	int toplamPaund=0;
    	System.out.println(Arrays.toString(arr));
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i].startsWith("$")) {
				toplamDolar+=(Integer.valueOf(arr[i].replace("$", "")));
			}else {
				toplamPaund+=(Integer.valueOf(arr[i].replace("£", "")));
				
			}
		}
    	
    	System.out.println("toplam dolar: "+ toplamDolar + " toplam Paund: " + toplamPaund);

    }


}


