package projeler;

public class Kitapcı_Main {

	public static void main(String[] args) {


		
		/* ====================PAZAR PROJEMIZ==============================
	 * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun
	 * program baslayinca menu isminde bir method calissin
		1-kitap ekle
		2-numara ile kitap goruntule
		3-bilgi ile kitap goruntule
		4-numara ile kitap sil
		5-tum kitaplari listele
		6-cikis
		************************************
		1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait yazar adi olacak
		ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir
		 list'te tutmamiz gerek
		2-kitap numarasi 1000'den baslamali,her kitap
		eklendiginde bir artacagi icin sayac gibi dusunulebilinir count=1000; menu
		 isminde bir method olusturmaliyim,
		3-kitap ekle diye bir method olusturmliyim,bu method farkli bir classda
		 4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Kitapcı_KitapEkle kitap = new Kitapcı_KitapEkle();

		
		menu();
		
		numaraIleKitap();
		
		Kitapcı_KitapEkle.kitapEkle();
		
		
	}

	private static void numaraIleKitap() {


	System.out.println(Kitapcı_KitapEkle.liste);
	
		
	}

	private static void menu() {
		
		System.out.println("//////////////// KİTAPCI PRIGRAMI //////////////////");
		System.out.println(
				" 	1-kitap ekle\n"
				+ "	2-numara ile kitap goruntule\n"
				+ "	3-bilgi ile kitap goruntule\n"
				+ "	4-numara ile kitap sil\n"
				+ "	5-tum kitaplari listele\n"
				+ "	6-cikis ");
		
		
	}

}
