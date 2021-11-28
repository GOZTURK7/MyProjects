package day11_stringManupulations;

public class C03_Length {

	public static void main(String[] args) {

		String str1 = "Ali Kahyaoğlu";
		
		System.out.println(str1.length());
		
		// Verilen str1'in son harfini yazdırın.
		
		

		System.out.println(str1.charAt(str1.length()-1)); // u
		
		
		String str2 = "";
		System.out.println(str2.length()); // 0

		
		//String str3 = null;
		//System.out.println(str3.length()); // null
		//Eğer sttring oluşturur ama değer atamazak yazdırğımızda hata verir null yazarsak
		// java hata yapmadığımızı şimdilik bu variable sonra kullanmak üzere boş
		// Strign str4 = null yazdığıımızda bıraktığımızı anlıyor ve hata vermiyor.
		
		
		// null pointer oluşturduğumuz fakat sonra kullanacağımız bir String'i işaretlemek
		// için kallanılır
		//Bir Strigi yazdırdığımızda null çıkıyorsa türkçe olarak
		// " Ben bu değişkeni oluşturdum ama henüz değer atamadım demek istiyor
		//String str4;
		//System.out.println(str4); // u

		
		//String str5 = "Çalışırsanız java öğrenmek çok kolay";
		//System.out.println(str5.indexOf('a')); // u


	}

}
