package day17_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {


		/*
		 Kullanıcıdan iki tam sayı isteyin,
		 ilk sayıdan başlayarak ikinci sayıya kadar üçer üçer yazdırın,
		 (ikinci sayı dahil olmak zorunda değil)
		 
		 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("iki tam sayı giriniz:");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > num2) { // azalarak gidecek
			for(int i=num1; i>=num2; i-=3) {
				System.out.print(i + " ");
			}
		}else if(num1<num2) {  //artarak gidecek
			for (int i = num1; i <= num2; i+=3) {
				System.out.print(i + " ");
			}
		}else {
			System.out.print("Girilen sayılar eşit");
		}
		scan.close();
		
	}

}
