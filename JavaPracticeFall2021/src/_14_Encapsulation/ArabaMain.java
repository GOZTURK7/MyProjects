package _14_Encapsulation;

public class ArabaMain {

	public static void main(String[] args) {

		Araba honda = new Araba();
		
		
		
		honda.setMotor(1300);
		
		honda.setModel("civic");
		
		honda.setYıl(2021);
		
		System.out.println(honda.getYıl());
		
		
		
	
		Araba volvo = new Araba("xc90", "Beyaz", 28, 2020);
		
		
		Araba ww = new Araba("Passat", "Kırmızı", 1600, -2021);
		
		System.out.println("seçtiğiniz araç volvo: " + volvo.getYıl()+" "+volvo.getRenk()+" "+volvo.getMotor());

		System.out.println("seçtiğiniz araç ww: " + ww.getYıl()+" " +ww.getRenk()+" "+ww.getMotor());

		
	}

}
