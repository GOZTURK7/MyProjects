package day17_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		/*
		 * soru; kullanıcıdan toplanmak üzere sayı isteyin kullanıcı sıfıra basıncaya
		 * kadar sayıları alıp toplamaya devem edin. kullanıcı sıfıra bastığında o ana
		 * kadar kaç sayı girdiğini ve girilen sayıların toplamını yazdırın
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		/*
		 loopun içinde kullanacağım obje ve variable'ları
		 loopdan önce oluşturmak daha güzeldir
		 çünkü loop'un içinde oluşturursak, loop her döndüğünde yeni bi obje
		 veya variable oluşturur
		 ve bu da hafızayı doldurur.
		 */
		
		
		/////////// BENİM ÇÖZÜMÜM/////////////
		
		int sayac= 0;
		int toplam = 0;
		boolean isFinish = false;

		while (isFinish == false) {
			System.out.println("Lütfen bir tam sayı girin "
					+ "\nBitirmek için 0 a basınız");
			int num = scan.nextInt();
			if (num != 0) {
				isFinish = false;
				toplam += num;
				sayac++;
			} else {
				isFinish = true;
			}
		}
		System.out.print("girilen sayı miktarı:" + sayac 
				+", Sayıların toplamı: "+ toplam);
		
		/////////// HOCANIN ÇÖZÜMÜ //////////////////////
		
		// loop'un icinde kullanacagim obje ve variable'lari
        // loop'dan once olusturmak daha guzeldir
        // cunku loop'un icinde olusturursak, 
        // loop her dondugunde yeni bir obje veya variable olusturur ve bu da hafizayi doldurur
        
        int sayi=33; // 0'in disinda ne yazarsak olur
        int toplam1=0;
        int sayac1=0;
        
        
        while (sayi!=0) {
            
            System.out.println("Lutfen toplama eklemek icin "
            		+ "bir tamsayi yazin \nbitirmek icin 0'a basin");
            sayi=scan.nextInt();
            toplam1+=sayi;
            sayac1++;
            
        }
        
        // kullanici 0'a bastiginda loop islevini son kez yapip
        // sonra basa donecek ve loop bitecek
        // 0 toplanmak uzere verilmeyip sadece bitirmek icin verildiginden
        // sifiri sayac'a eklememek icin 46.satirda sayac-1 yaptik
        System.out.println("girilen sayi adedi : " + (sayac-1));
        System.out.println("girilen sayilarin toplami : " + toplam);
        scan.close();
	}

}
