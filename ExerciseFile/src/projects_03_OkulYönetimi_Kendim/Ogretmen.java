package projects_03_OkulYönetimi_Kendim;

public class Ogretmen extends Personel{
	
	
	private String bolum;
	private int sicilNo;
	
		
	public Ogretmen() {
		super();
	}


	public Ogretmen(String ad, String SoyAd, int kimlikNo, int yas, int sicilNo, String bolum) {
		super(ad, SoyAd, kimlikNo, yas);
		this.bolum=bolum;
		this.sicilNo=sicilNo;

	}


	@Override
	public String toString() {
		return "Ogretmen [bolum=" + bolum + ", sicilNo=" + sicilNo + "]";
	}




}
