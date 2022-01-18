package h07_crudProje;

public class Main {

	public static void main(String[] args) {

		CrudMetodlar metod = new CrudMetodlar();
		metod.sessionFactoryOlustur();
		
		// VERİ TABANINA PERSONEL EKLE METODU İLE PERSONE EKLEYECEĞİZ:
		metod.personelEkle("Ömer", "TUFAN", 7700);
		metod.personelEkle("Süleyman", "MATKULİYEV", 8800);
		metod.personelEkle("Adil", "TURGUT", 9900);

		
//		metod.idIlePersonelSil(3);
		
		
//		metod.idIleMaasGuncelle(1, 10000);
		
		metod.sil();
		
		metod.tumPersoneliListele();
		
		
		
		
		
		
	}

}
