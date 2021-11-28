package day26_forEachLoop_Constructor;

public class C04_ForEachLoopSlideSoru4 {

	public static void main(String[] args) {


		/*
		 * Soru 4:
	Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak yazdiriniz. 
	ipucu: split()
		 */
		
		String str="GokhanOzturk";
		
		for (String i : str.split("")) {
			System.out.println(i + " ");
		}
		
	}

}
