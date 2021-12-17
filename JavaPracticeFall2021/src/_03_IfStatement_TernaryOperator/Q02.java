package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 1. Sayıyı Giriniz:");
		int sayi1 = scan.nextInt();
		
		System.out.println("Lütfen 2. Sayıyı Giriniz:");
		int sayi2 = scan.nextInt();
		
		System.out.println("Lütfen 3. Sayıyı Giriniz:");
		int sayi3 = scan.nextInt();
				
		int mutlak = ((sayi1-sayi2) > 0) ? (sayi1-sayi2): ((sayi1-sayi2) * (-1));
		int mutlak1 = ((sayi1-sayi3) > 0) ? (sayi1-sayi3): ((sayi1-sayi3) * (-1));
		int mutlak2 = ((sayi2-sayi3) > 0) ? (sayi2-sayi3): ((sayi2-sayi3) * (-1));
		
		boolean ucgenMi = (sayi1 + sayi2) > sayi3 && (sayi3 > mutlak) 
				|| (sayi1 + sayi3) > sayi2 && (sayi2 > mutlak1)
				|| (sayi2 + sayi3) > sayi1 && (sayi1 > mutlak2);
		
		if (sayi1==sayi2 && sayi1==sayi3 && sayi2==sayi3){
			System.out.println("Bu bir eş kenar üçgen");
		}else if (ucgenMi == true) {
				System.out.println("Bu bir üçgen");
		}else {
			System.out.println("Bu bir üçgen değil");
				
		}
		scan.close();				

	}

}
