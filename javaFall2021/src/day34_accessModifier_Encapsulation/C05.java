package day34_accessModifier_Encapsulation;

public class C05 {
	
	private int asgariMaas=4000;

	public static void main(String[] args) {


		// bir class'taki herhangi bir class üyesine ulaşılabilsin ama değiştirilemesin deyorsanız
		//	1- Class üyesini "private" yapın.
		//  2- private class üyelerine hiçbir şekilde ulaşım olmayacağı için sadece görebilme yetkisi verin.
		//     getter() oluşturun.
		
	}

	public int getAsgariMaas() {
		return asgariMaas;
	}

	

}
