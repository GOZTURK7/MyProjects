package _09_Arrays;

import java.util.Iterator;

public class Q07_MDArraysIcindeMaxDeğeriBul {

    public static void main(String[] args) {
        /*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */

    	
    	int input [][]= {{1,2,-3},{41,55},{-61,-17,80}};
    	
    	
    	maxDegerBul(input);
	

    }

	private static void maxDegerBul(int[][] input) {
		int enBuyuk=0;
    	
    	for (int i = 0; i < input.length; i++) {
    		for (int j = 0; j < input[i].length; j++) {
				if(input[i][j] > enBuyuk) {
					enBuyuk=input[i][j];
				}
			}
		}System.out.println(enBuyuk);		
	}
}
