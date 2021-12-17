package day27_constructor_ConstructorCall;

public class Tir {

	
	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	
	public Tir(int i, String string, String string2, int j, boolean b) {
		/*  int km, String model, String renk, String yil, boolean satilikMi

		 * Tir Runner class'indan yolladığımız değerlerin instance variable'lar ile eşleşmesi için 
		 * atamaları yapmam lazım.
		 */
		
		km=i;
		model=string;
		renk=string2;
		yil=j;
		satilikMi=b;

	}


	public Tir(int km, String model, String renk) {
		// i, string ve string2 isim olarak güzel ve anlaşılır isimler değil
		// daha anlaşılır olması için variable isimlerini anlamlı yapalım.
		//  int km, String model, String renk	
		this.km=km;
		this.model=model;
		this.renk=renk;
		
		// başına this. yazdığımızda java bu variable'ın class leveldaki olduğunu anlar.

	}

}
