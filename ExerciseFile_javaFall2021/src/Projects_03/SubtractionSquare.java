package Projects_03;

import java.util.Scanner;

public class SubtractionSquare {

	/*
	 * 
	 * Given one method name is substSquare
	 * 
	 * This method get two ints as parameter
	 * 
	 * return type is int
	 * 
	 * Get square of the sum of the numbers using getSumOfSquares method ,
	 * 
	 * Parameter 1 square of the sum + Parameter 2 square of the sum = your result
	 * 
	 * for example: int 1 = 10
	 * 
	 * int 2 = 5;
	 * 
	 * 3025 + 225 = 3250
	 * 
	 * return 3250
	 * 
	 */

	/*
	 * substSquare isminde bir method verildiğinde bu method parametre olara iki int
	 * alır return tipi int olur
	 * 
	 * getSumOfSquares methodunu kullanarak
	 * 
	 * 
	 * Parameter 1 toplamin karesi+Parameter 1 toplamin karesi= sonuc
	 * 
	 * 
	 * Örnek:
	 * 
	 * int 1 = 10; yazacağınız method 10 u kullanarak 3250 sonucu verir
	 * 
	 * int 2 = 5; yazacağınız method 5 i kullanarak 225 sonucu verir
	 * 
	 * 3025 + 225 = 3250
	 * 
	 * return 3250
	 */

	int x = 10;

	int y = 5;

	public int getSumOfSquares(int x, int y) {

		int a = 0;
		int b = 0;
		for (int i = 1; i <= x; i++) {
			a += i * i;
		}
		for (int i = 1; i <= y; i++) {
			b += i * i;
		}

		return a + b;
	}

	public int substSquare(int x, int y) {

		return getSumOfSquares(x, y);
	}

}
