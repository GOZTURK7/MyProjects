package team_Works;

import java.util.Scanner;

public class Exercise_Haluk_SM6 {

	public static void main(String[] args) {
		 /*
	       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
	        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
	        
	        
	        
	        1_ kullancıdan email adresini iste
	        
	        2_ eğer hotmail. varsa içeriyorsa gmail. ile değiştir.
	        
	        3_ içermiyorsa emailiniz kaydedildi.
	        */
		
			System.out.println("//// 1.YOL //////");
		
		
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Lütfen e-mail adresinizi giriniz:");
			String email = scan.next();
			
			if(email.contains("hotmail")) {
				System.out.println("mailiniz gmail olarak kaydedilecektir.");
				System.out.println(email.replaceAll("hotmail" , "gmail"));
			}
			else {
				System.out.println(email+ " e-mailiniz kaydedildi");
			}
			
			
			System.out.println("///// 2.YOL /////");
			
			System.out.println((email.contains("hotmail")) ? ("mailiniz gmail olarak kaydedilecektir.\n"+ email.replaceAll("hotmail" , "gmail")) : (email+ " e-mailiniz kaydedildi"));
			
			scan.close();
			
			
			
		
	}

}
