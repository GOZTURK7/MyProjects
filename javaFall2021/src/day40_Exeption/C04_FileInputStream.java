package day40_Exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {


		// Java'da bir dosyaya ulaşmak istediğimizde FileInputStream class'ından yardım alırız.
		
		FileInputStream fis = new FileInputStream("src/day40_Exeption/yazi.txt");
		
		
		/* Java Bu kodda olası bir problem öngörüyor ve bu probleme karşı ne yapması gerektiğini
		 * bize soruyor. (Yani altı çizilen her kod CTE değildir.)
		 * 
		 * Bunun için iki durum söz konusu;
		 * 		1-	try - catch kullanarak bu problemi HANDLE ediP Java'nın yoluna devam etmesini 
		 * 			sağlayabiliriz.
		 * 		2-	Eğer dosya okunamıyorsa kod çalışmasın istiyorsanız olayın farkında olduğumuzu
		 * 			ve sorumluluğun bizde olduğunu java'ya söylemeliyiz.
		 */
		
		
		
		
		
		
		System.out.println("görev tamamlandı.");
	}

}
