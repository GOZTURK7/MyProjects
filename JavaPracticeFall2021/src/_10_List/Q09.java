package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen bir cümle giriniz: ");
    	String input = scan.nextLine().toLowerCase();
    	
    	int characters [] = new int [256];
    	
    	for (int i = 0; i < input.length(); i++) {
			characters[input.charAt(i)]++;
		}
    	
    	
    	int encokTekrar=-1;
    	char result = ' ';
    	
    	for (int i = 0; i < input.length(); i++) {
			if (characters[input.charAt(i)] > encokTekrar) {
				encokTekrar=characters[input.charAt(i)];
				result = input.charAt(i);
			}
		}
    	System.out.println("Result "+result + " tekrar sayısı: "+encokTekrar);
    	
    	
    	
    }
}

