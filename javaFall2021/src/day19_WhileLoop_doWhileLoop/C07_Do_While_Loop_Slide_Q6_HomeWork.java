package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_Do_While_Loop_Slide_Q6_HomeWork {

	public static void main(String[] args) {


		/*
		 Soru 6 ) Kullanicidan toplamak icin sayi isteyin ve 
		 toplam 500’e ulasincaya kadar devam istemeyi ettirin. 
		 Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		int toplam=0;
		int counter=0;
		
		do {
			System.out.println("Lütfen bir tam sayı giriniz");
			int num = scan.nextInt();
			toplam+=num;
			counter++;
		}while(toplam < 500);
		
		
		System.out.println("Toplam: " + toplam+ ", Girdiğiniz sayı miktarı: "+counter);
		
		scan.close();
	}

}
