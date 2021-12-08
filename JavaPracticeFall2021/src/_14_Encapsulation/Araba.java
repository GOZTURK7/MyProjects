package _14_Encapsulation;

public class Araba {
	
	private String model;
	private String renk;
	private int motor;
	private int yıl;
	
	
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getRenk() {
		return renk;
	}


	public void setRenk(String renk) {
		this.renk = renk;
	}


	public int getMotor() {
		return motor;
	}


	public void setMotor(int motor) {
		if (motor >= 100) {
			this.motor=motor;
			System.out.println("agam tekerine taş değmesin");
		}else {
			System.out.println("Agam eğlenir 100'ün altında beygir gücü olmaz.");
		}
	
	}


	public int getYıl() {
		return yıl;
	}


	public void setYıl(int yıl) {
		
		if (yıl < 0 ) {
			System.out.println("negatif yıl giremezsiniz.");
			this.yıl = -yıl;
		}else {
			this.yıl = yıl;
		}
		
		
	}
	
	
	public Araba() {
		
	}
	
	
	public Araba(String model, String renk, int motor, int yıl) {
		super();
		this.model = model;
		this.renk = renk;
		//this.motor = motor;
		//this.yıl = yıl;
		
		setYıl(yıl);
		setMotor(motor);
	}
	

	


}
