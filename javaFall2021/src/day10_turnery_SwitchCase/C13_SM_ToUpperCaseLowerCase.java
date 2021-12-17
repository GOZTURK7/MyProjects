package day10_turnery_SwitchCase;

import java.util.Locale;

public class C13_SM_ToUpperCaseLowerCase {

	public static void main(String[] args) {


		// verilen Stringin tamamını büyük veya küçük harfe çevirir.
		
		String isim = "aLI";
		
		System.out.println(""+isim.toUpperCase().charAt(0) + isim.toLowerCase().charAt(1)
				+ isim.toLowerCase().charAt(2)); // A büyük Ali olarak yazdır
		
		// türkçe local harfler kullanarak tamamını küçük harfe çevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		
		
	}
	
	
	

}
