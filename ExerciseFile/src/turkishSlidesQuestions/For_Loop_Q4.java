package turkishSlidesQuestions;

import java.util.Scanner;

public class For_Loop_Q4 {

	public static void main(String[] args) {
		
		
		/*
		 Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
		 */
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 100 den küçük bir tam sayı griiniz:");
		double num = scan.nextDouble();
		int sayi=(int) num;
//		
//		for(int i=1; i<=num; i++) {
//			System.out.print((i%3==0) ? (i+" ") : (""));
//		}
		
		
		////// 2. YOL /////////
		
			// sayı negatifse veya tam sayı değilse uyarı verelim
		
			if(num<0) {
				System.out.println("Negatif sayı giremezsiniz");
			}else if (sayi!=num) {
				System.out.println("Lütfen tam sayı giriniz:");
			}else if(sayi >100){
				System.out.println("100 den küçük sayı giriniz:");
			}else {	
				
				for(int j=1; j<=num; j++) {
					if(j%3==0) {
						System.out.println(j + " ");
					}
				}
			}
				
				
	
		
		
	}

}
