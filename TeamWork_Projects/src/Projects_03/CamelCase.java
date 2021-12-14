package Projects_03;

import java.util.Scanner;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
 

	
	public static String camelcase(String s) {
		
		s=s.toLowerCase();	
	
		if (!s.contains(" ")) return s.substring(0,1).toUpperCase()+s.substring(1);
		
		String ilkHarf = s.substring(0,1).toUpperCase();
		
		String ilkBosluk= ilkHarf + s.substring(1, s.indexOf(" ")+1);
		//System.out.println(ilkBosluk);
		
		return  ilkBosluk + camelcase(s.substring(s.indexOf(" ")+1));
		
}


    }



