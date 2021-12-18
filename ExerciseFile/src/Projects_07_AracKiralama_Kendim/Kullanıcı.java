package Projects_07_AracKiralama_Kendim;

public class Kullanıcı {
	
	String adıSoyadı;
	int yas;
	double kimlikNo;
	double kartNo;
	
	String alinacakSehir;
    String alinacakGun; //(MM,dd--> ay gun formatında olmalı)
    String alisSaati;
    String teslimGunu;  //(MM,dd--> ay gun formatında olmalı)
    String teslimSaati;
	
    @Override
	public String toString() {
		return "Kullanıcı [adıSoyadı=" + adıSoyadı + ", yas=" + yas + ", kimlikNo=" + kimlikNo + ", kartNo=" + kartNo
				+ ", alinacakSehir=" + alinacakSehir + ", alinacakGun=" + alinacakGun + ", alisSaati=" + alisSaati
				+ ", teslimGunu=" + teslimGunu + ", teslimSaati=" + teslimSaati + "]";
	}

    
    
  
    
}
