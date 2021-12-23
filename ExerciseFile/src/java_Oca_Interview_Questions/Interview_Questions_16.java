package java_Oca_Interview_Questions;

import java.util.Iterator;

public class Interview_Questions_16 {

	public static void main(String[] args) {
		/*
		 Ask user to enter the number of lines of a inverted half pyramid by using numbers.
		 Type a program to create the inverted half pyramid.
		 For example if the number of lines is 5, the pyramid will be like;

		 1 2 3 4 5
		 1 2 3 4
		 1 2 3
		 1 2
		 1

		 Kullanıcının  girdigi satır sayısı kadar sayılarla ters yarım piramid sekli yazdıran bir program create ediniz.

		 */
		
		int num = 6;
		
		
		for (int i = num; i >= 0; i--) {
			
			for (int j = 1; j < i; j++) {
				
				System.out.print(j+" ");

			}
			System.out.println();
			
		}
	}

}
