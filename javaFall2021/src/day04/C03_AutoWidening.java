package day04;

public class C03_AutoWidening {

	public static void main(String[] args) {

		
		byte sayi1 = 44;
		
		short sayi2 = sayi1;
		// eşitliğin sol tarafı short sağ tarafı byte
		// iki data türü farllı olduğu halde java itiraz etmiyor
		// çünkü atama yapılan variable'ın data türü (short) atanan değerin veri türünden (byte) büyük olduğu için sorun oluşmaz
		
		System.out.println("sayi2 : " + sayi2);
		
		
		
		int sayi3 = 55;
		
		double sayi4 = sayi3;
		
		System.out.println("sayi4 : " + sayi4);

		
		
		
	}

}
