package day42_AbstractClass;


public class UstaBasi extends Isci {
	
	public void statu() {
		System.out.println("Bu calass'taki tüm personel ustabaşıdır. imza ustabaşı");
	}
	public void maas() {
		System.out.println("Ustabaşları aylık 10000tl maaş alır. imza ustabaşı");
	}	
	public void mesai() {
		System.out.println("Ustabaşları arıza durumunda arıza bitene kadar çalışır. imza ustabaşı");
	}
	
	/* Obje oluşturduğumuz en alttaki Class parent Class'lardaki methodları 
	 * Override edince Class'tan oluşturulan objeler en doğru ve spesifik
	 * özelliklere kavuştu.
	 *  
	 * Ama klasik Parent-Child ilişkisinde tüm methodaları override etme mecburiyeti yoktur.
	 * 
	 * Java Parent Class'lardaki tüm methodları override MECBURİYETİ kazandırmak için Abstract Class
	 * yapısını oluşturmuştur.
	 * 
	 * yani bir Class'ı abstract olarak tanımlarsanız child class'lar tüm methodları 
	 * override etmek zorunda kalır.
	 * 
	 * Dolayısıyla abstract yaptığımız parent class'lar sadece kalıp görevi yapacaklar.
	 *  
	 */ 
	public static void main(String[] args) {


		UstaBasi ust1 = new UstaBasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
		
		
		
		
	}

}
