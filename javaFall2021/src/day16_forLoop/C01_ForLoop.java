package day16_forLoop;

public class C01_ForLoop {

	public static void main(String[] args) {

		////// KONU 1 NORMAL ÇALIŞMA DURUMU /////////
		for (int i = 0; i < 11; i++) {
			
			System.out.print(i +" ");		
			
			/*
			 for loop başlangıç ve bitiş şartı bir sayının değerine bağlı olan
			 durumlarda tercih edilir.
			 */
			
			
			
			
			
			/////// KONU 2 İNFİNİTE LOOP /////////
			
			/*for (int j = 0; j < 10; j--) { 
				System.out.println(j);
			} 
			*/
			/*
			 eğer başlangıç sayısı artış / azalış ile bitiş değerine yaklaşmıyor
			 uzaklaşıyor ise loop hiçbir zaman durmaz (INFINITE LOOP) SONSUZ DÖNGÜ'ye girer.
			 ve bu durumun gerçekleşesini isteyiz
			 */
			
			
			
			
			
			//////// KONU 3 HİÇ ÇALIŞMAMA DURUMU ////////
			
			for (int j = 0; j > 10; j++) { 
				
			}
			/*
			 eğer ilk değer için bitiş şartı true olmazsa daha ilk adımda loop broken olur 
			 LOOP BODY ÇALIŞMADAN, loop'un sonrasına geçilir.
			 
			 LOOP ÇALIŞIR şartı kontrol edeer şart daha ilk adımda sağlanmadığından BODY ÇALIŞMAZ
			 ve broken olur.
			 */
		}
	}

}
