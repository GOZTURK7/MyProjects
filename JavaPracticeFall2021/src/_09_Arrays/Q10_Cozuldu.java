package _09_Arrays;

import java.util.Arrays;

public class Q10_Cozuldu {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarılı"
	        * with arrays change it to "CoookBasarılı" and write changing array
			*(String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
			*
			*/
		
		String str= "GayetBasarılı";
		String[] strNew= new String [1];
		str=str.replace("Gayet", "Coook");
		strNew[0]=str;
		System.out.println(Arrays.toString(strNew));
		
		

		
	}

}
