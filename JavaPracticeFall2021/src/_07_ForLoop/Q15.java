package _07_ForLoop;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {
      
        for(int satır=65; satır<71;satır++) {
        	for(int sutun=65; sutun<=satır; sutun++) {
        		char c = (char) sutun;
        		System.out.print(c+ " ");
        	}System.out.println();
        }
    	
    	
    }
}
