package Projects_03;

import java.util.Scanner;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /*
   substSquare isminde bir method verildiğinde
   bu method parametre olara iki int alır
   return tipi int olur

   getSumOfSquares methodunu kullanarak


Parameter 1 toplamin karesi+Parameter 2 toplamin karesi= sonuc


   Örnek:

    int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir

    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250

    return 3250
    */

	

	
	
	
	public static int substSquare(int a, int b) {
		
		int aKare= (a*(a+1)/2)*(a*(a+1)/2);
		int bKare= (b*(b+1)/2)*(b*(b+1)/2);
		int result=aKare + bKare;
		
		return result;
		
	}
	
	
}


