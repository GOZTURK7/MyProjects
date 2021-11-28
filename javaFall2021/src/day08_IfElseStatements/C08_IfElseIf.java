package day08_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir gün ismi girinizi: ");
		String gun = scan.next();
		System.out.println(gun);
		scan.close();
	}

}
