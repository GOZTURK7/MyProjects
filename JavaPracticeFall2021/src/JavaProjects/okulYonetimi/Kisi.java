package JavaProjects.okulYonetimi;

public class Kisi {
	
	private String adSoyad;
	private String KimlikNo;
	private int yas;
	
	public Kisi() {
		
	}
	
	
	public Kisi(String adSoyad, String kimlikNo, int yas) {
		super();
		this.adSoyad = adSoyad;
		KimlikNo = kimlikNo;
		this.yas = yas;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public String getKimlikNo() {
		return KimlikNo;
	}
	public void setKimlikNo(String kimlikNo) {
		KimlikNo = kimlikNo;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
	

}
