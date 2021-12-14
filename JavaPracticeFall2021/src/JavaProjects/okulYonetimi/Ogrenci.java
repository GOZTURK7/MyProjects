package JavaProjects.okulYonetimi;

public class Ogrenci extends Kisi{
	
	private String numara;
	private String sinif;

	
	
	
	
	



	public Ogrenci(String numara, String sinif,String adSoyad, String kimlikNo, int yas)) {
		super(adsoyad, kimlikNo, yas);
		this.numara = numara;
		this.sinif = sinif;
	}
	public String getNumara() {
		return numara;
	}
	public void setNumara(String numara) {
		this.numara = numara;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

}
