package day35_encapsulation_Inheritance;

public class C01 {

	
		private double not = 49.9;
		private boolean gecerMi=false;
		private String adSoyad="Gökhan Öztürk";
		
		
		public String getAdSoyad() {
			return adSoyad;
		}



		public void setNot(double not) { // başka klaslarlardan argument olarak yazılan değerler bu methoda parametre olarak gelecek.
			this.not = not;
		}


		public boolean isGecerMi() {
			
			if(not>=50) {
				gecerMi=true;
			}		
			return gecerMi;
		}


		
	
		
		
		
	

}
