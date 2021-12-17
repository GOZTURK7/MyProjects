package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

	/*
	 * 100 den kucuk asal sayilari yazdiran bir program yaziniz
	 */
	public static void main(String[] args) {

		for (int i = 100; i > 1; i--) {
			
			boolean flag=true;
			
			for (int j = 2; j < i; j++) {
				
				if(i%j==0) {
					flag=false;
				}

				
			}if (flag) {
				System.out.print("("+i+ ") ");
			}

		}
		
	}
}
