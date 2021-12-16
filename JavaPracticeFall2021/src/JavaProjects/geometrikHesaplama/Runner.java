package JavaProjects.geometrikHesaplama;

public class Runner {

	public static void main(String[] args) {


		
		Kare sekilKare = new Kare(4.0);
		
		//sekilKare.kenar=4;
		
		System.out.println(sekilKare.cevre());
		System.out.println(sekilKare.alan());

		
		Dikdörtgen sekiDikdörtgen = new Dikdörtgen(4,6);
		
		//sekiDikdörtgen.kısaKenar=4;
		//sekiDikdörtgen.uzunKenar=6;

		System.out.println(sekiDikdörtgen.cevre());
		System.out.println(sekiDikdörtgen.alan());
		
		
		Cember cmb = new Cember();
		cmb.yarıCap=3;
		System.out.println(cmb.alan());
		System.out.println(cmb.cevre());

		
		
		
		
		
		
	}

}
