package Projects_06_GaleriOtomasyon_Kendim;

public abstract class Araba {
	
	
	private static double fiyat;
	private static String marka;
	private static String model;
	private static boolean isOld;
	
	


	abstract void move();
	
	public static void diesel() {
		
		System.out.println("Bu araç Dizeldir.");
	}
	
	public static void benzin() {
		
		System.out.println("Bu araç Benzinlidir.");
	}
	
	
	
	
	
	
	
	public static boolean isOld() {
		return isOld;
	}

	public static void setOld(boolean isOld) {
		Araba.isOld = isOld;
	}
	
	public static double getFiyat() {
		return fiyat;
	}
	public static void setFiyat(double fiyat) {		
		Araba.fiyat = fiyat;
	}
	public static String getMarka() {
		return marka;
	}
	public static void setMarka(String marka) {
		Araba.marka = marka;
	}
	public static String getModel() {
		return model;
	}
	public static void setModel(String model) {
		Araba.model = model;
	}
	

}
