package JavaProjects.geometrikHesaplama;

public class Dikdörtgen extends Sekil {

	double uzunKenar;
	double kısaKenar;
	
	public Dikdörtgen() {
		
	}
	
	public Dikdörtgen(double uzunKenar, double kısaKenar) {
		this.uzunKenar=uzunKenar;
		this.kısaKenar=kısaKenar;
		
	}
	
		

	@Override
	public double cevre() {
		
		double cevre=(uzunKenar+kısaKenar)*2;		
		
		return cevre;
		
	}

	@Override
	public double alan() {
		
		double alan=uzunKenar*kısaKenar;
		
		return alan;

		
	}
	
	
	
	
}
