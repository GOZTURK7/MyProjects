package projects_03_OkulYönetimi_Kendim;

public class Ogrenci extends Personel{
	
	private int numara;
	private String sinif;
	
	
	

	public Ogrenci(String ad, String SoyAd, int kimlikNo, int yas, int numara, String sinif) {
		super(ad, SoyAd, kimlikNo, yas);
		this.numara=numara;
		this.sinif=sinif;

	}




	@Override
	public String toString() {
		return "Ogrenci [ad=" + super.getAd() + ", soyAd=" + super.getSoyAd() + ", kimlikNo=" + super.getKimlikNo() + ", yas=" + super.getYas() + ", numara="+numara+", Sınıf="+sinif+"]";
	}




}
