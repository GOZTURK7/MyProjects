package JavaProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaMarket {

static	Scanner scan = new Scanner(System.in);
	
	
static List<String> urunler = new ArrayList<>(Arrays.asList("00 Domates","01 Patates","02 Biber","03 Sogan","04 Havuç","05 Elma","06 Muz","07 Çilek","08 Kavun","09 Üzüm","10 Limon"));
static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));
static List<String> sepetUrunler = new ArrayList<>();
static List<Double> sepetKg = new ArrayList<>();
static List<Double> sepetFiyatlar = new ArrayList<>();



	public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */
		
		Scanner scan = new Scanner(System.in);

		String devam="";
		
		double toplamFiyat=0;
		do {
			
			urunListesi();
			System.out.println("seçtiğiniz ürün kodunu giriniz: ");
			int urunNo = Integer.parseInt(scan.nextLine()); // scan.nextInt veya nextType herhangi birisi \n içeriyor ve sonrai satırı es geçiyor. burada parseInt kullanmak bir çözüm
			System.out.println("kaç kilo alacaksınız: ");
			double kg = Double.parseDouble(scan.nextLine());
			sepeteEkle(urunNo, kg);
			toplamFiyat=sepetTutarı();
			System.out.print("devam edecek misiniz? e/h");
			devam=scan.nextLine();
			//scan.nextLine(); // dummy kukkla 
			
			
		}while(devam.equalsIgnoreCase("e"));
		
		odeme(toplamFiyat);
		
	}



	private static double sepetTutarı() {

		double sepetTutar=0;
		double sptKg=0;
		for (int i = 0; i < sepetUrunler.size(); i++) {
			sepetTutar+=sepetFiyatlar.get(i);
			sptKg+=sepetKg.get(i);
			
		}
		System.out.println("Toplam ödemeniz gereken miktar: " +sepetTutar+ " Aldığnız ürünün miktarı: "+ sptKg);
		
		return sepetTutar;
	}



	private static void odeme(double toplamFiyat) {

		System.out.println("Ödemeniz gereken miktar: "+ toplamFiyat);
		double nakit = 0;
		do {
			System.out.println("Lütfen nakit ödemeyi giriniz: ");
			nakit+= scan.nextDouble();
			if (nakit < toplamFiyat) {
				System.out.println("eksik ödeme yaptınız " + (toplamFiyat-nakit)+ " daha ödeme yapınız.");
			}
			
			
			
			
		}while(nakit<toplamFiyat);
		
		double paraUstu=nakit-toplamFiyat;
		
		if(paraUstu>0){
			System.out.println("Para Üstünüz: "+ paraUstu);
		}
		
		System.out.println("Yine Bekleriz İyi günler.");
		
	}



	private static void sepeteEkle(int urunNo, double kg) {
 
		sepetUrunler.add(urunler.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(urunNo)*kg);
		
		
		
	}



	private static void urunListesi() {
		
		System.out.println("no\t Urunler \t Fiyatlar");
		System.out.println("====\t ======== \t ========");
		
		for (int i = 0; i < urunler.size(); i++) {
			
			System.out.println(" "+i+"\t"+urunler.get(i)+"\t"+fiyatlar.get(i));
		}
		
	}
}
