package Projects_04_hastaneOtomasyon_Kendim;

public class HastaneRunner {
	/*
	 * Main metodumuzun hazir oldugundan emin olalim Main method da iki variable
	 * olusturunuz String hastaDurumu String unvan Ve asagidaki custom methodlari
	 * olusturunuz public static String doktorUnvan(String aktuelDurum) { } Sonra
	 * sirasiyla asagidaki adimlari takip ediniz If aktuelDurum ==> Allerji return
	 * Allergist If aktuelDurum ==> Bas agrisi return Norolog If aktuelDurum ==>
	 * Diabet return Genel cerrah If aktuelDurum ==> Soguk alginligi return Cocuk
	 * doktoru If aktuelDurum ==> Migren return Dahiliye If aktuelDurum ==> Kalp
	 * hastaliklari return Kardiolog else return yanlis unvan Sonra bu methodunuzu
	 * unvan variable iniza atayiniz
	 * 
	 * 2. olarak; public static Doktor doktorBul(String unvan){ } Sonra asagidaki
	 * objeyi metodunuzda olusturunuz Doktor doktor= new Doktor(); Simdi loop
	 * kullanarak unvaninizla Doktor objenizin tum variablelarini set ediniz
	 * VeriBankasindan gelen bilgilerle Ve return doktor;
	 * 
	 * 3. olarak; 
	 * 	public static Durum hastaDurumuBul(String aktuelDurum)
		Ve Durum classindan bir Obje olusturunuz
		Durum hastaDurumu = new Durum();
		Sonra asagidaki adimlari sirasi ile yapiniz ve tum durumlari set ediniz
		Switch veya if statement kullanabilirsiniz
		case " Allerji":  aciliyet => false
		case " Bas agrisi":  aciliyet => false
		case " Diabet":  aciliyet => false
		case " Soguk alginligi":  aciliyet => false
		   
		case " Migren":  aciliyet => true
		case " Kalp hastaliklari":  aciliyet => true
		default:
		System.out.println(“Gecerli bir durum degil");
		Ve return hastaDurumu;
		
		
		 public static Hasta hastaBul(String actualCase)
		 Burada Hasta objesi olusturunuz Hasta classindan
		 Hasta hasta = new Hasta();
		 Loop kullaniniz ve aktuelDurumu kiyaslayiniz Data classindan
		 Hasta bilgilerini kullaniniz ve tum Hasta Objesindeki bilgileri set ediniz
		 Ve sonra hastaDurumuBul method unu cagiriniz ve Durum Objesini set ediniz
		 Son olarak return hasta;
	 * 
	 */
	//Scanner scan = new Scanner(System.in);
	private static Hastane hastane1 = new Hastane();
	static String hastaDurumu = "Allerji";
	public static void main(String[] args) {
		String unvan = doktorUnvan(hastaDurumu);
		
		hastane1.setDoktor(doktorBul(unvan)); 
		
		hastane1.setHasta(hastaBul(hastaDurumu));
		
		System.out.println(doktorBul(unvan).toString());
		
		System.out.println(hastaBul(hastaDurumu).toString());
		

	}

	private static String doktorUnvan(String aktuelDurum) {

		if (aktuelDurum.equals("Allerji"))
			return "Allergist";
		if (aktuelDurum.equals("Bas agrisi"))
			return "Norolog";
		if (aktuelDurum.equals("Diabet"))
			return "Genel cerrah";
		if (aktuelDurum.equals("Soguk alginligi"))
			return "Cocuk doktoru";
		if (aktuelDurum.equals("Migren"))
			return "Dahiliye";
		if (aktuelDurum.equals("Kalp hastaliklari"))
			return "Kardiolog";
		else
			return "yanlis unvan";

	}

	public static Doktor doktorBul(String unvan) {
		Doktor doktor = new Doktor();

		for (int i = 0; i < VeriBankasi.unvanlar.length; i++) {
			if (unvan.equals(VeriBankasi.unvanlar[i])) {
				doktor.setIsim(VeriBankasi.doctorIsimleri[i]);
				doktor.setSoyIsim(VeriBankasi.doctorSoyIsimleri[i]);
				doktor.setUnvan(VeriBankasi.unvanlar[i]);
			}

		}

		return doktor;
	}
	
	public static Durum hastaDurumuBul(String aktuelDurum) {
		Durum hastaDurumu = new Durum();
		hastaDurumu.setAktuelDurum(aktuelDurum);
		
		switch(aktuelDurum) {
		case "Allerji":
			hastaDurumu.setAciliyet(false);
			break;
		case "Bas agrisi":
			hastaDurumu.setAciliyet(false);
			break;
		case "Diabet":
			hastaDurumu.setAciliyet(false);
			break;
		case "Soguk alginligi":
			hastaDurumu.setAciliyet(false);
			break;
		case "Migren":
			hastaDurumu.setAciliyet(true);
			break;
		case "Kalp hastaliklari":
			hastaDurumu.setAciliyet(true);
			break;
		default:
			System.out.println("Gecerli bir durum degil");
			break;
		}
		return hastaDurumu;
	}
	
	public static Hasta hastaBul(String actualCase) {
		Hasta hasta = new Hasta();
		for (int i = 0; i < VeriBankasi.durumlar.length; i++) {
			if (hastaDurumu.equals(VeriBankasi.durumlar[i])) {
				hasta.setHastaDurumu(hastaDurumuBul(VeriBankasi.durumlar[i]));
				hasta.setIsim(VeriBankasi.hastaIsimleri[i]);
				hasta.setSoyIsim(VeriBankasi.hastaSoyIsimleri[i]);
				hasta.setHastaID(VeriBankasi.hastaIDleri[i]);
				
			}
			
		}
			
		
		return hasta;
	}

}
