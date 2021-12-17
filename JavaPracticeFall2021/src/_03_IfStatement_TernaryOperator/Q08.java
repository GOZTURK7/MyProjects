package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Kaç Adet Ürün Aldığınızı Girin:");
		double adet = scan.nextInt();
		
		System.out.println("Lütfen Ürünün Liste Fiyatını Girin:");
		double listeFiyatı = scan.nextInt();
		
		System.out.println("Müşteri Kartınız Varsa 'Evet' yoksa 'Hayır' yazınız:");
		String kart = scan.next();
		System.out.println(kart);

		
		if (kart.equalsIgnoreCase("Evet")) {
			System.out.println("Müşteri Kartınız Var");
			if (adet > 10) {
				System.out.println("% 20 İndirim Kazandınız eski fiyatınız: "+ (listeFiyatı*adet)
			+" Yeni Fiyatınız: " + ((adet*listeFiyatı)-adet*(listeFiyatı*2/10)));
			}else {
				System.out.println("% 15 İndirim Kazandınız eski fiyatınız: "+ (listeFiyatı*adet)
						+" Yeni Fiyatınız: " + ((adet*listeFiyatı)-adet*(listeFiyatı*1.5/10)));
			}
			
		}else if(kart.equalsIgnoreCase("Hayır")) {
			System.out.println("Müşteri Kartınız Yok");
			if (adet > 10) {
				System.out.println("% 15 İndirim Kazandınız eski fiyatınız: "+ (listeFiyatı*adet)
						+" Yeni Fiyatınız: " + ((adet*listeFiyatı)-adet*(listeFiyatı*1.5/10)));
			}else {
				System.out.println("% 10 İndirim Kazandınız eski fiyatınız: "+ (listeFiyatı*adet)
						+" Yeni Fiyatınız: " + ((adet*listeFiyatı)-adet*(listeFiyatı*1/10)));
			}
		}else {
			System.out.println("Lütfen Evet yada Hayır yazınız.");
		}
		scan.close();
		
	}

}
