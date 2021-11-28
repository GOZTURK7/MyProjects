package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu cm cinsinden giriniz:");
		double boy = scan.nextInt();
		
		System.out.println("Lütfen kilonuzu kg cinsinden giriniz:");
		double kilo = scan.nextInt();
		
		double bmi = kilo/(boy/100*boy/100);
		
		if (bmi <= 20) {
			System.out.println("BMI: "+bmi+" Oludukça zayıfsınız");
		}else if (bmi <= 25) {
			System.out.println("BMI: "+bmi+" Normal Sınırlardasınız");	
		}else if (bmi <= 30) {
			System.out.println("BMI: "+bmi+" Şişman kategorisindesiniz");	
		}else if (bmi <= 25) {
			System.out.println("BMI: "+bmi+" Normal Sınırlardasınız");	
		}else {
			System.out.println("BMI: "+bmi+" Obez grubundasınız");	

		}
		scan.close();
		


    }

}
