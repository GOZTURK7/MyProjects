package Projects_05_FilmTahminOyunu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class guessMovie {
	
	/* *****************************Filmi Tahmin Et Oyunu**************************************
                 * 1. Bir tane film isim listesi olusturun
		 * 2. Kullanicadan liste uzunlugunda bir sayi isteyip, o siradaki filmi cagirin..
		 * 3. filmin ismindeki harfleri "-" olacak sekilde ceviririp kullaniciya gösterin.
		 * 4. Kullanicidan bir harf tahmin etmesini isteyin
		 * 5. Bu harfin isimde olup olmadigini kontrol edin.
		 * 6. Girilen harf dogruysa ismin tamaminda bu harfi gösterin.
		 * 7. Toplam kac yanlis harf tahmin edildigini gösterin ve limit asildiysa kaybettin yazdirin.
		 * 8. Eger hepsi dogru tahmin edildiyse kazandin yazdirin.
Orjinal Task
Step by step
Don't rush into building the entire game at once, start small, for example:
Write some code that will simply read the movie list and display the whole list.
Then add to your code to randomly pick one movie and display that title only.
Then convert its letters to underscores (_) and display that instead, and so on.
Once you've got that part done start reading the user's input and search for it in the title.
Work on revealing the correct letters and displaying them.
Add the logic to keep track of wrong letters so they don't lose points for guessing the same letter twice.
After that, you can keep track of how many wrong guesses and end the game if they lose.
Finally, detect when they have guessed all the letters and let them know they've won!
You can also start by hard coding a single movie title in the code 
instead of randomly picking one from the file, then add the file reading functionality at the end.
	 * 
	 * 
	 * 1 - create movie list
	 * 2 - a code which show all list,
	 * 3 - pick rondomly one movie and display that movie's title
	 * 4 - convert film's letters to _ and display that ,
	 * 5 - ask user to input a guessed letter and search if it's exist or not in the movie's title,
	 * 6 - reveal the correct letters and display
	 * 7 - aynı harfi iki kere tahmin ettiyse ikincisinde puan kaybetmesin yanlış hakkı 5 olsun
	 * 8 - yanlış tahminleri takip et ve kaybettiyse oyunu bitir.
	 * 9 - 
	 */

	static List<String> filmList = List.of("Baba", "Truva", "Salako", "Mavi Boncuk", "Tokatçı", "Cesur Yürek","Mucize Doktor");
	
	public static void main(String[] args) {

		showList(filmList);
		
		Random randint = new Random();
		int randomIdx= randint.nextInt(filmList.size());
		
		String randomFilmName=filmList.get(randomIdx);
		
		System.out.println(randomFilmName);
		
		String filmNameSecret=filmList.get(randomIdx).replaceAll("[a-zA-züöşğçı]", "_ ");// veya ("\\S"), "_")
		
		System.out.println(filmNameSecret);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir harf tahmin et: ");
		
		String harf = scan.next(); 
		
		String afterGuessFilmName="";
		
		for (int i = 0; i < randomFilmName.length(); i++) {
			
			if(harf.charAt(0)==randomFilmName.charAt(i)) {
				
		
				
				//filmNameSecret.
				
				
				//System.out.println(filmNameSecret);
				
			}
		}

	}
	
	public static void showList(List<String> list) {
		
		System.out.println("************** FILM LIST *************\r\t");
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(i+1+". "+list.get(i)+"\r");		
			
		}
		
	}

}
