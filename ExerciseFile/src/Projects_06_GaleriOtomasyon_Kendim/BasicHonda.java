package Projects_06_GaleriOtomasyon_Kendim;

public class BasicHonda extends Araba implements DısAraba, IcAraba {

	String marka;
	String model;
	double fiyat;
	boolean isOld;
	

	public BasicHonda() {
		
	}
	
	public BasicHonda(String marka, String model, double fiyat, boolean isOld ) {
		
		this.marka=marka;
		this.model=model;
		this.fiyat=fiyat;
		this.isOld=isOld;
		
	}

	@Override
	public String toString() {
		return "BasicHonda [marka=" + marka + ", model=" + model + ", fiyat=" + fiyat + ", isOld=" + isOld + "]";
	}

	@Override
	public void direksiyon() {
		System.out.println("Basic Honda İçin Direksiyon Manueldir.");
	}
	@Override
	public void koltuk() {
		System.out.println("Basic Honda için Koltuklar Kumaş Kaplamadır.");
	}

	@Override
	public void klima() {
		System.out.println("Basic Honda İçin Klima Manueldir.");
	}

	@Override
	public void kapı() {
		System.out.println("Basic Honda Üç Kapılıdır.");
	}
	@Override
	void move() {
		System.out.println("Basic Honda Düz Vitestir (move())");
	}

}
