package Projects_06_GaleriOtomasyon_Kendim;

public class LuxHonda extends Araba implements DısAraba, IcAraba {
	
	
	
	
	public LuxHonda() {
		
	}
	
	public LuxHonda(String marka, String model, double fiyat, boolean isOld ) {
		
		super.setMarka(marka);
		super.setModel(model);
		super.setFiyat(fiyat);
		super.setOld(isOld);
		
	}
	
	

	@Override
	public void direksiyon() {
		System.out.println("Lux Honda İçin Direksiyon Otomatiktir.");
	}
	@Override
	public void koltuk() {
		System.out.println("Lux Honda İçin Koltuklar Deri Kaplamadır.");
	}

	@Override
	public void klima() {
		System.out.println("Lux Honda İçin Klima Otomatiktir.");
	}

	@Override
	public void kapı() {
		System.out.println("Lux Honda Beş Kapılıdır.");
	}

	@Override
	void move() {
		System.out.println("Lux Honda Otomatik Vitestir. (move())");
	}

	
}
