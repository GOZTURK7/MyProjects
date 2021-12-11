package turkishSlidesQuestions;

import java.util.Scanner;

public class For_Loop_Q10 {

	public static void main(String[] args) {

		/*
		 Kullanicidan iki sayi isteyin. 
		 Girilen sayilar ve aralarindaki tum tamsayilari toplayip, 
		 sonucu yazdiran bir program yaziniz
		 */
		
		
		///// 1. YOL ///////////

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki sayı giriniz");
		int num1 = scan.nextInt();
		int num2= scan.nextInt();
		
		int toplam = 0;
		if(num1 > num2) {
			for(int i=num1; i >= num2; i--) {
				toplam+=i;
			}
		}else if (num1 <= num2) {
			for(int i=num2; i >= num1; i--) {
				toplam+=i;
			}
		}System.out.println(toplam);
			
		
		
		
		///////// 2. YOL ////////////
		
//		int kucuk=0;
//		int buyuk=0;
//		
//		if(num1 > num2) {
//			buyuk=num1;
//			kucuk=num2;
//		}else {
//			buyuk=num2;
//			kucuk=num1;		
//		}
//		int toplam1=0;
//		
//		for(int j=kucuk; j<=buyuk; j++) {
//			toplam1+=j;
//		}System.out.println(toplam1);
		
		
		
	}

}
