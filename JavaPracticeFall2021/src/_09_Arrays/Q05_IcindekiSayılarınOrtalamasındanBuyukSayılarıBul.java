package _09_Arrays;

public class Q05_IcindekiSayılarınOrtalamasındanBuyukSayılarıBul {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage
		 * (dizi elemanlarinin ortalama degerini hesaplayan ve
		 * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
		 * input[]= {1,2,3,4,5,6,7} 
		 * Output : 4
		 */
		
		int input[]= {1,2,3,4,5,6,7};
	
		ortalama(input);
		
		for (int i = 0; i < input.length; i++) {
			if(input[i] > ortalama(input)) {
				System.out.println(input[i]);
			}
		}		
	}

	private static int ortalama(int[] input) {
		int ortalama=0;
		for (int i = 0; i < input.length; i++) {
			 ortalama+=input[i];
		}
		return (ortalama/input.length);
	}

}
