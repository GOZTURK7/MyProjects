package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

    	int num = 9;
    	String harfler = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	
    	
       for (int i=0; i<num; i++) {
    	   for(int j=0; j<=i; j++) {
    		   System.out.print(harfler.charAt(i)+ " ");
    	   }System.out.println();
       }
    	
    	
       
       
       
       
       
       
       for (int i=0; i<num; i++) {
    	   for(int j=i+1; j<num; j++) {
    		   System.out.print(" ");
    	   }
    	   for(int k=0; k<=i; k++) {
    		   System.out.print(harfler.charAt(i)+" ");
    	   }System.out.println();
    		   
       }
    	
    }

}
