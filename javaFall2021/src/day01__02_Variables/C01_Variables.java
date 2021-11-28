package day01__02_Variables;

public class C01_Variables {
	
	public static void main(String[] args) {
		
//	variable oluşturmak ve değer atamak farkli işlemlerdir.
//	istersek variable oluşturma ve deger atamayi tek satirda yapabilirsiniz.
		
		String ogrenciIsim = "Gökhan";
		
		System.out.println(ogrenciIsim);
		
//		istersek de önce oluşturur, istediğimiz zaman da değer atayabiliriz.
		
		int sayi;
		sayi=10;
	
		System.out.println(sayi);
		
//		biz daha önce oluşturulmuş ve değer ataması yapılmış bir değişkene yeni değer atayabiliriz
//		bu durumda java variable'ın eski değerini silip yeni değeri variable'a atar.
		sayi=25;
		System.out.println(sayi);
		
		
		ogrenciIsim = "Mustafa";
		
		System.out.println(ogrenciIsim);
		
	}
	
}
