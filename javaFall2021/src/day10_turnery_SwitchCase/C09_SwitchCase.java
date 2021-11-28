package day10_turnery_SwitchCase;

public class C09_SwitchCase {

	public static void main(String[] args) {

		// harf olarak girilen notu rakama çevirin
		// A 85-100
		// B 60-85
		
		
		char not = 'A';
		
		switch(not) {
		
		case 'A':
			System.out.println("85-100 arası");
			break;
		case 'B':
			System.out.println("60-85 arası");
			break;
		case 'C':
			System.out.println("50-60 arası");
			break;
		case 'D':
			System.out.println("50'den düşük");
			break;
		default:
			System.out.println("Geçersiz Harf Notu Girdiniz.");		
		}
	}

}
