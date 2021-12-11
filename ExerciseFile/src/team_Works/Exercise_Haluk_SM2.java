package team_Works;

public class Exercise_Haluk_SM2 {

	public static void main(String[] args) {
		/*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
		/*
		 
		 	1- iki stringinde de sadece rakamları almamız lazım
		 	
		 	2- string olan bu rakamları double'a çeviricez
		 	
		 	3- bunları toplayacağız
		 	

		 
		 */
		
	
			String  str1= "%13.99";
		    String str2= "%10.55";
		    
		    String str1Formatlı= str1.replace("%", "");
		    String str2Formatlı= str2.replace("%", "");

		    double str1Double = Double.parseDouble(str1Formatlı);
		    double str2Double = Double.parseDouble(str2Formatlı);

		    
		    System.out.println(str1Double);
		    
		    System.out.println(str2Double);
		    
		    
		    System.out.println(str1Double + str2Double);
		
		
		    
		    
	}

}
