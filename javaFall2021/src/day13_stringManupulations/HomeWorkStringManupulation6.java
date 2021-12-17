package day13_stringManupulations;

import java.util.Scanner;

public class HomeWorkStringManupulation6 {

	public static void main(String[] args) {
					/*Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki 
					 	sartlari sagliyorsa "Sifre basari ile tanimlandi", 
					 	sartlari saglamazsa "Islem basarisiz, Lutfen yeni bir sifre girin" yazdirin
							- Ilk harf buyuk harf olmali
							- Son harf kucuk harf olmali
							- Sifre bosluk icermemeli
							- Sifre uzunlugu en az 8 karakter olmali
	*/						

		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lütfen 8 karakterli bir sifre giriniz. "
       		+ "\n:Ilk harf buyuk harf olmali "
       		+ "\nSon harf kucuk harf olmali "
       		+ "\nSifre bosluk icermemeli "
       		+ "\nSifre uzunlugu en az 8 karakter olmali ");       
        
        String passWord = scan.next();
        
        
        char firstChar = passWord.charAt(0); 
        char lastChar = passWord.charAt(passWord.length()-1);
        boolean isContainSpace = passWord.contains(" ");
        int passwordLength = passWord.length();
        
        
		if (firstChar >= 'A' && firstChar <='Z' 
				&& lastChar >= 'a' && lastChar<='z' 
				&& isContainSpace == false 
				&& passwordLength >=8) {
			System.out.println("Şifre başarı ile tanımlandı.");
			
		}else {
			System.out.println("işlem başarısız lütfen yeni bir şifre giriniz");

		}
		
		scan.close();
	}

}
