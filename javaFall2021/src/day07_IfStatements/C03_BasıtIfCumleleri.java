package day07_IfStatements;

import java.util.Scanner;

public class C03_BasıtIfCumleleri {

	public static void main(String[] args) {
		
		
         //Soru 3) Kullanicidan gun ismini alin ve 
         //haftaici veya hafta sonu oldugunu yazdirin 
           // Ornek:      gun=Pazar output = “Hafta sonu”
                       // gun=Sali output = “Hafta ici”
         //*\ String icin equals method’unu kullanin


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir gün ismi giriniz");
		String günIsmi = scan.next().toLowerCase();
		
		// String non-primitive olduğu için == kullanılamaz BUNUN YERİNE equals() methodu kullanılmalıdır.
		if (günIsmi.equals("pazar") || günIsmi.equals("cumartesi")) {
			System.out.println("Haftasonu");		
		}
		
		if (günIsmi.equals("pazartesi") 
				|| günIsmi.equals("sali") 
				|| günIsmi.equals("çarşamba") 
				|| günIsmi.equals("perşembe") 
				|| günIsmi.equals("cuma")) {
			
				System.out.println("Haftaiçi");		
		}

		
		scan.close();

	}

}
