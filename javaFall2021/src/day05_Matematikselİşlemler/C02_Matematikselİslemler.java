package day05_Matematikselİşlemler;

public class C02_Matematikselİslemler {

	public static void main(String[] args) {

		int sayi1 = 10; 
		int sayi2 = 20;
		
		String str1 = "Ali";
		String str2 = "Can";
		
		System.out.println(sayi1 + sayi2 + str1); //OUTPUT: 30Ali,
		System.out.println(str1 + sayi1 + sayi2); //OUTPUT: Ali1020,
		System.out.println(str2 + (sayi1 + sayi2)); //OUTPUT: Can30,
		System.out.println(sayi1 * sayi2 + str1); //OUTPUT: 200Ali,
		System.out.println(str1 + sayi1 * sayi2); //OUTPUT: Ali200, çarpama öncelikli olduğundan önce çarpmayı yapar sonra string ile toplar



		
		
	}

}
