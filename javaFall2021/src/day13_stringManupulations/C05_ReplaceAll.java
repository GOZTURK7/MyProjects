package day13_stringManupulations;

public class C05_ReplaceAll {

	public static void main(String[] args) {

		String cumle = "Java      cok     zevkli";
		
		cumle=cumle.replaceAll("\\s++", " ");// birden fazla boşluğu bir boşlukla değiştiriyoruz.
		
		System.out.println(cumle);
		
		//cumle=cumle.replaceAll("\\S", "*"); // boşluk dışındaki tüm karakterleri 
											// * işareti ile değiştirdi **** *** ******
		//System.out.println(cumle);

		
		cumle= cumle.replaceAll("[ak]", ""); // a ve k ları yok etti.
		
		System.out.println(cumle);
		
		cumle= cumle.replaceAll("[a-z]", ""); // J a ve z arasındakileri yok etti.

		System.out.println(cumle);

		
	}

}
