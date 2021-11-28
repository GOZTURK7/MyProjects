package day13_stringManupulations;

import java.util.Scanner;

public class HomeWorkStringManupulation5 {

	public static void main(String[] args) {
		/* soru5)	Kullanicidan 4 harfli bir kelime alin 
		 	ve ekrana tersten yazdirin.
		 */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("4 harfli bir kelime giriniz:");       
        
        String kelime = scan.next();
        
        
        if (kelime.length()!=4) {
            
            System.out.println("Lutfen 4 haneli kelime giriniz");
            
        } else {
            System.out.println("girilen 4 harfli kelimenin tersten yazilisi: " + 
        kelime.substring(3,4)+
        kelime.substring(2,3)+
        kelime.substring(1,2)+
        kelime.substring(0,1));
        }
        
    
        scan.close();
        
	
	}

}
