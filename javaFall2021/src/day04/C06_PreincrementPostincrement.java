package day04;

public class C06_PreincrementPostincrement {
	
	public static void main(String[] args) { 
		
		// preincremen ve postincrement sadece sayı++ veya sayı-- yazımı için geçerlidir.
		
		
		int sayi = 10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi); // 13
		
		System.out.println(sayi++); // bu satırda iki işlem var
									// bir artırma , bir de yazdırma var.
		
		System.out.println(sayi); //14
		
		// Önce artırmak sonra yazdırmak istiyorsan; ++sayi
		
		// Önce yazdırmak sonra artırmak isterseniz sayi++

		System.out.println(++sayi);
		
		
		
	}

}
