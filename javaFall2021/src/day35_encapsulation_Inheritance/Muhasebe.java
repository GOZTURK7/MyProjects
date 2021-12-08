package day35_encapsulation_Inheritance;

public class Muhasebe  extends Personel{
	
	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public Muhasebe(){
		System.out.println("Muhasebe parametresiz constructor çalıştı");

	}

	public static void main(String[] args) {

		
		Muhasebe calisan1 = new Muhasebe();
		
		calisan1.isim="Ali";
		
		System.out.println(calisan1.soyisim);
		

		
		
		
	}

	
	public int maasHesapla() {
		
		int maas = 8*25*saatUcreti;
		
		
		
		return maas;
	}
	
	
	
	
}
