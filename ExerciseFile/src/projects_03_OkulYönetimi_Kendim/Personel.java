package projects_03_OkulYönetimi_Kendim;

public class Personel {
	
	private String ad;
	private String soyAd;
	private int kimlikNo;
	private int yas;
	
	
	
	
	@Override
	public String toString() {
		return "Personel [ad=" + ad + ", soyAd=" + soyAd + ", kimlikNo=" + kimlikNo + ", yas=" + yas + "]";
	}

	public Personel() {
		
	}
	
	public Personel(String ad, String SoyAd, int kimlikNd, int yas) {
		
		this.ad=ad;
		this.soyAd=soyAd;
		this.kimlikNo=kimlikNo;
		this.yas=yas;
		
		
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public int getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(int kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	



	
	

}
