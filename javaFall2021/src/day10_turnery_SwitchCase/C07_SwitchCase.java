package day10_turnery_SwitchCase;

public class C07_SwitchCase {

	public static void main(String[] args) {

		// gün numarasına göre gün isimlerini yazırıralım
		
		int gunNo = 10;
		
		
		switch(gunNo) {
			
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;	
		default:
			System.out.println("Lütfen Geçerli Bir Numara Girin");		}
		
		
	}

}
