package turkishSlidesQuestions;

import java.util.Scanner;

public class For_Loop_Q01_Q03 {

	public static void main(String[] args) {
		
		/*
		 QUESTİON 1: 
		 Ekrana 10 kez “Java guzeldir” yazdirin
		 */
		
		for(int i=1; i<11; i++) {
			System.out.println(i+"Java guzeldir");
		}
		
		/*
		 QUESTİON 2: 
		 10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda yazdirin
		 */
		
		for(int i1=10; i1<31; i1++) {
			
			if(i1==30) {
				System.out.print(i1);
			}else {
				System.out.print(i1 + ", ");
			}
			
			
		}System.out.println();
		
		/*
		 QUESTİON 3: 
		 100’den baslayarak 50’ye kadar olan sayilari aralarinda virgule olarak ayni satirda yazdirin
		 */
		
		for(int i2=100; i2 > 49; i2--) {
			System.out.print(i2 + ", ");

			

		}System.out.println();
		
		
		
	}

}
