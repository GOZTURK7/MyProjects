package day16_forLoop;

public class C02_NestedForLoop {

	public static void main(String[] args) {


		/*
		 birden 4 e kadar sayıları yan yana aralarında bir boşluk bırakarak yazdırın.
		
		 */
		
		int num = 3;
		
		for(int i=1; i<=num; i++) {
			//System.out.print(i + " ");
			
			for(int j=1; j<=num; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	
		
		
	}

}
