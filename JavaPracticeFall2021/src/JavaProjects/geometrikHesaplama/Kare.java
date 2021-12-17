package JavaProjects.geometrikHesaplama;

public class Kare extends Dikdörtgen{

	double kenar;
	
	public Kare() {
		
	}
	
	public Kare(double Kenar) {
		this.kenar=Kenar;
	}
	
	
	public double cevre() {
		
		double cevre=(kenar)*4;		
		
		return cevre;
		
	}

	
	public double alan() {
		
		double alan=kenar*kenar;
		
		return alan;

		
	}
	
	
}
