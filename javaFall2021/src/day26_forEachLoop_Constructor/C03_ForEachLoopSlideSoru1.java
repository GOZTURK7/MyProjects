package day26_forEachLoop_Constructor;

public class C03_ForEachLoopSlideSoru1 {

	public static void main(String[] args) {


		/*
		 *  For Each Loop
			Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
			kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 */
		
		
		int arr[] = {3,4,2,5};
		
		
		int carpım=1;
		for (int i : arr) {
				carpım*=i;
			
		}System.out.println(carpım);
		
		
	}

}
