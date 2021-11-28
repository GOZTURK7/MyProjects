package day13_stringManupulations;

public class C02_replace {

	public static void main(String[] args) {


		/*
		 String olarak verilen 10000 sayısının binden büyük olup
		 olmadığını yazdırın.
		 */
		
		String sonuc = "10.000";
		sonuc = sonuc.replace(".", ""); // 10000 e çevirip sonuca assign ettik
		// = olduğu iin sonuc kalıcı olarak değişti.
		
		
		System.out.println(sonuc);
		
		if (Integer.valueOf(sonuc) > 1000) {
			System.out.println("bulunan sonuc sayısı 1000'den çok");

		}else {
			System.out.println("bulunan sonuc sayısı 1000'den az");

		}
		
		
	}

}
