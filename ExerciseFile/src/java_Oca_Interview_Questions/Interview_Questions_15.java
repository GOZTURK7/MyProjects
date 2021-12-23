package java_Oca_Interview_Questions;

public class Interview_Questions_15 {

	public static void main(String[] args) {
		/*

		Ask user to enter the number of lines of a half pyramid.
		Type a program to create the half pyramid.
		For exampleif the number of lines is 5, the pyramid will be  like;
		*
		* *
		* * *
		* * * *
		* * * * *

		Kullanıcının  girdigi satır sayısı kadar yarım piramid sekli yazdıran bir program create ediniz.


		 */

		
		int num = 8;
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		
		int a = 1;
		for (int i = num; i >=0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			a++;
			System.out.println();

		}
		

		
	}

}
