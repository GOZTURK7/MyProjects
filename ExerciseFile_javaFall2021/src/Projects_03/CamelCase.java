package Projects_03;

import java.util.Scanner;

public class CamelCase {

	/*
	 * First letter to upper case parameter is one String return type is String
	 * words are delimited by a space. All the words first letter should be camel
	 * case
	 * 
	 * input:
	 * 
	 * I lIVe in uSa
	 * 
	 * Result should be
	 * 
	 * I Live In Usa
	 * 
	 */

	/*
	 * Soru 1: CamelCase : camelcase adında Kendisine gönderilen bir cümledeki
	 * kelimelerin ilk karakterlerini büyük harfe çevirip geri döndüren metodun
	 * yazınız. input:
	 * 
	 * I lIVe in uSa
	 * 
	 * Result should be
	 * 
	 * I Live In Usa
	 * 
	 */

	String str = "I lIVe in uSa";

	public String camelcase() {

		str = str.toLowerCase().trim();
		str.substring(0, 1).toUpperCase();

		for (int i = 0; i < str.length(); i++) {

			if (str.substring(i, i + 1).equals(" ")) {
				str = str.substring(i + 1, i + 2).toUpperCase();
			}
		}

		return str;
	}

}
