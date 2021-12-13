package team_Works;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scrable {

	
		/*
		 * CONSTRUCTOR Soru 2: 
			Write a Scrabble Game for two person Rules 
			OK== 1- At the beginning Ask to first Player enter a word for starting game 
			OK 2- Then change the player ask to new player if given word is valid or not 
			OK i) If new player accepts the given word add number of letters in the word as points to player who wrote the word And go to step 3 
			OK ii) If new player does not accept the word as valid then print "Invalid word, player X(Current player) won the game" and finish the game
			OK 3- Ask to users if user want to continue game or not 
			OK i) If player want to continue, OK ask to user a letter to add to word OK and ask to user side to add (beginning or end) 
			OK then add letter to word and run step 2
			OK ii) If player does not want to continue then print "Game Finished" and print points and winner

		 */
		
		
		
	static Scanner scan = new Scanner(System.in);
    static int puan1;
    static int puan2;
    static String oyuncu;
    static String kelime;
    static String eklenen;
    static char kabul;
    static String oyuncu1;
    static String oyuncu2;
    public static void main(String[] args) {
        System.out.println("Hosgeldiniz");
        System.out.println("1.oyuncunun ismi ");
        oyuncu1 = scan.next();
        oyuncu = oyuncu1;
        System.out.println("2.oyuncunun ismi ");
        oyuncu2 = scan.next();
        System.out.println(oyuncu1 + " kelimenizi giriniz");
        kelime = scan.next();
        System.out.println(oyuncu1+bitis(oyuncu1) + " kelimesi  : " + "'"+kelime+"'");
        elGecti();
        sor();
    }
    public static void sor() {
        System.out.println(oyuncu + "  girelen kelimeyi kabul ediyor musun?   E/H");
        kabul = scan.next().charAt(0);
        if (kabul == 'E') {
            if (oyuncu.equals(oyuncu1)) {
                puan2 += kelime.length();
                System.out.println(kelime);
            } else {
                puan1 += kelime.length();
                System.out.println(kelime);
            }
            tamammiDevammi();
        } else {
            System.out.println("Gecersiz kelime");
            oyunBitir();
        }
    }
    public static void tamammiDevammi() {
        System.out.println("Oyuna devam etmek için = 1  Bitirmek İçin =  2'ye basın.");
        int devam = scan.nextInt();
        if (devam == 2) {
            oyunBitir();
        } else {
            kelimeEkle();
        }
    }
    public static void kelimeEkle() {
        System.out.println(oyuncu+" kelimeni gir");
        eklenen = scan.next();
        System.out.println(oyuncu+" Kelimeni nereye eklemek istersin? Basa = 3  Sona = 4");
        if (scan.nextInt() == 3) {
            kelime = eklenen + kelime;
        } else {
            kelime = kelime + eklenen;
        }
        elGecti();
        sor();
    }
    public static void oyunBitir() {
        System.out.println("Oyun bitti");
        System.out.println(oyuncu1 + bitis(oyuncu1) + " puani : " + puan1);
        System.out.println(oyuncu2 + bitis(oyuncu2) + "  puani : " + puan2);
        if (kabul == 'H') {
            System.out.println(oyuncu + " kazandi Cunku rakip gecersiz kelime girdi.");
        } else if (puan1 > puan2) {
            System.out.println(oyuncu1 + " kazandi.");
        } else if (puan2 > puan1) {
            System.out.println(oyuncu2 + " kazandi.");
        } else {
            System.out.println("Berabere");
        }
    }
    public static void elGecti() {
        if (oyuncu.equals(oyuncu1)) {
            oyuncu = oyuncu2;
        } else {
            oyuncu = oyuncu1;
        }
    }
    public static String bitis(String s) {
        String ei = "ei";
        String aı = "aı";
        String ou = "ou";
        String öü = "öü";
        // kamil
        // veli
        String sesliler = "aeiıoöüu";
        if (sesliler.contains(s.substring(s.length() - 1))) {
            if (ei.contains(s.substring(s.length() - 1))) {
                return "`nin";
            }
            if (aı.contains(s.substring(s.length() - 1))) {
                return "`nın";
            }
            if (ou.contains(s.substring(s.length() - 1))) {
                return "`nun";
            }
            if (öü.contains(s.substring(s.length() - 1))) {
                return "`nün";
            }
        }
        String harfkontrol = "";
        if (!sesliler.contains(s.substring(s.length() - 1))) {
            List<String> seslilist = List.of("a","e","ı","i","o","ö","u","ü");
           
            for (int i = s.length() - 1; i >= 0; i--) {
                for (int j = 0; j < seslilist.size(); j++) {
                    if (s.substring(i, i + 1).equals(seslilist.get(j))) {
                        harfkontrol = s.substring(i, i + 1);
                        break;
                    }
                }
                if (!harfkontrol.isEmpty()) {
                    break;
                }
            }
            if (ei.contains(harfkontrol)) {
                return "`in";
            }
            if (aı.contains(harfkontrol)) {
                return "`ın";
            }
            if (ou.contains(harfkontrol)) {
                return "`un";
            }
            if (öü.contains(harfkontrol)) {
                return "`ün";
            }
        }
        return "";
    }
		

}
