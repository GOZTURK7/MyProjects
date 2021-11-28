package _07_ForLoop;

public class Q19 {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
               
               
               şeklini konsola yazdiriniz.
     */

    public static void main(String[] args) {

    	
    	
    	
    	for (int i=1; i<6; i++) {
    		for(int j=6; j>i; j--) {
    			System.out.print(" ");
    		}for(int k=1; k<=i; k++) {
    			System.out.print("* ");
    		}System.out.println();
    	}

    }
}

