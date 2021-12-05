package Team_Working_Proje2;

public class sumTotal {

	/*
	 * Create String 2D array
	 * 
	 * {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
	 * 
	 * if the String has $ multiply by 3.2
	 * 
	 * if the String has € multiply by 4.2
	 * 
	 * return the double
	 * 
	 */

	/*
	 * String 2D array oluştur
	 * 
	 * {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
	 * 
	 * String de $ varsa 3.2 ile çarp
	 * 
	 * String de € varsa 4.2 ile çarp
	 * 
	 * double return et
	 * 
	 */
	public static void main(String[] args) {

//        Koda burdan başlayın
		
		String arr [][] =  {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
		
		for (String[] w : arr) {
			
			for (int i = 0; i < w.length; i++) {
				
				if (w[i].contains("$")) {
					
					double a = Integer.parseInt(w[i].replace("$", ""));
					
					System.out.println(a * 3.2);
				
				}else if (w[i].contains("€")) {
					
					double b = Integer.parseInt(w[i].replace("€", ""));
					
					System.out.println(b * 4.2);
				}
		
				
			}
			
		}

	}
}
