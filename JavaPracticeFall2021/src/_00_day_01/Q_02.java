package _00_day_01;

public class Q_02 {

	public static void main(String[] args) {

		
		/*
		  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
		          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
		          \\: prints a back slash :\ (ters slash) yazdırır
		          \': prints single quote :' tek tırnak yazdırır.
		          \": prints double quote :"" Çift tırnak yazdırır.
	​
		 */
		 
		 	//  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdırınız

	 	//  Soru-2 :   Pazartesi kelimesini her harfini ayrı bir satıraca gelecek şekilde yazdırınız


		System.out.println(" \"Hello \" , \"World \\ /\"");
		System.out.println("\tMerhaba abi");
		System.out.println("P\na\nz\nr\nt\nt\ne\ns\ni");


		//Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız
		
		System.out.println("\"Java\" ile hayat cok \'afilli\'");

		//Soru-4 : "Basari" gayrete
		// 'asiktir'  yazdırınız sonraki "TechProEd ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ilerideyazılsın.

		System.out.println(" \"Basari\" gayrete \n\'asiktir\' \n\n\n\t\"TechProEd ile java çok kolay ...\"");

	}

}
