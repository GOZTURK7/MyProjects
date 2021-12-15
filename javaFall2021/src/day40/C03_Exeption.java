package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exeption {

	public static void main(String[] args) {


		// Verilen bir int array için 
		// Kullanıcıdan sayı isteyin ve girilen sayıyı index olarak kabul edip 
		// o index'teki elementi yazdırın.
		
		
		int arr []= {2,3,4,5,2,7,9,1};
		// ArrayIndexOutOfBoundException
		// InputMismatchException
		
		try {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen elementi yadırmak için index giriniz: ");
		int index = scan.nextInt();
		
		System.out.println("Girdiğiniz index'teki element : "+arr[index]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiğinz index array'de yok"+e);
			
		}catch(InputMismatchException e) {
			System.out.println("Girdiğiniz index pozitif tam sayı olmalı");
		}
		

		
	}

}
