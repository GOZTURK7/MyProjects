package JavaProjects.geometrikHesaplama;

public class Cember extends Sekil{
	
	double yarıCap;
	final double PI=3.14;

	@Override
	public double alan() {

		double alan = PI*yarıCap*yarıCap;

		return alan;
	}

	@Override
	public double cevre() {

		double cevre= 2*PI*yarıCap;
		
		return cevre;
	}
	
	
	
}
