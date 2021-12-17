package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       şeklini konsola yazdiriniz.

        
 	
    	for(int i=1; i<=6; i++) {
    		
    		for(int k=1; k<=i; k++) {
    			System.out.print(" ");
    		}
    		
    		for(int j=i; j<=6; j++) {
    			System.out.print(j+" ");

    		}
    		System.out.println();
    	}
        
    	
    	System.out.println("-----------YENİ SORU AYNISINI BAKLAVA YAPARSAK-----------------");
    	
    	
    	for(int a=0; a<7; a++) {
	    	for (int b=a+1; b<7; b++) {
	    		System.out.print(" ");
	    	}
    		for(int c=1; c<=a; c++) {
    			System.out.print(" "+c);
    		}
    		System.out.println();
    	}
    	
    	for(int x=1; x<=6; x++) {
    		
    		for(int y=1; y<=x; y++) {
    			System.out.print(" ");
    		}
    		
    		for(int z=x; z<=6; z++) {
    			System.out.print(z+" ");

    		}
    		System.out.println();
    	}
    	
    }
}


