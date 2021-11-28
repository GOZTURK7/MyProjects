package _08_While_DoWhile;

import java.util.Scanner;

public class Q06_BolmeOperatoruKullanmadanBolme {
	static int bolum=0;  //Clas level'da bir variable ilk değeri 0 atanmış.

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bölünecek sayıyı giriniz.");
		int bolunen=scan.nextInt();
		System.out.println("Lütfen bölen sayıyı giriniz");
		int bolen=scan.nextInt();
		
		System.out.println("sonuc :" + bol(bolunen, bolen));
		

		scan.close();
		
	}

	public static int bol(int bolunen, int bolen) {
		while(bolunen>=bolen) {
			bolunen-=bolen;
			bolum++;}
		
		return bolum;
	}
	
}


