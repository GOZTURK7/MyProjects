package day10_turnery_SwitchCase;


public class C04_NestedTurney {

	public static void main(String[] args) {

		//Verilen harf kucuk harf ise consola “Kucuk Harf” , buyuk harfse
		//consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.

		
		
		char krk = 's'; 
		
		
		
		//String Sonuc = (krk >= 'a' && krk <= 'z') ? "Küçük Harf" : (// şart yanlış ise sonuç) ; 

		String sonuc = (krk >= 'a' && krk <= 'z') ? "Küçük Harf" : 
			((krk >= 'A' && krk <= 'Z') ? "Büyük Harf" : "Girilen Karakter Harf Değil"); 

		System.out.println(sonuc);
	}

}
