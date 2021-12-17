package kitapcı_Projesi;

public class EklenenKitaplar {
	
	public int stokAdedi;
	public int kitapNo;
	public String kitapAdı;
	public String yazar;
	public int kitapFiyatı;
	
	
	public EklenenKitaplar() {
		
	}
	
	
	public EklenenKitaplar (int kitapNo, String kitapAdı, String yazar, int kitapFiyatı, int stokAdedi) {
		this.kitapNo=Kitapcı_KitapEkle.count;
		this.kitapAdı=kitapAdı;
		this.yazar=yazar;
		this.kitapFiyatı=kitapFiyatı;
		this.stokAdedi=stokAdedi;
	}


}
