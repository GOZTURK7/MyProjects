package Team_Working_Proje1;

import java.util.Arrays;
import java.util.Scanner;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


     /*
     3 tane pozitif String verildiğinde
     sayısal olmayan tüm karakterleri kaldırın.
     Stringleri int e çevirin
     ve total print edin

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        NOT : Eğer output 0 dan küçük ise outputu -1 e cevir





    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine(); //$!"^$-12 $&&(-15 =)($-12

        String[] elements = allElements.replaceAll("[^0-9 -]", "").split(" ");
        System.out.println(Arrays.toString(elements));
        @SuppressWarnings("unused")
		String num1 = elements[0]; 

        @SuppressWarnings("unused")
		String num2 = elements[1];

        @SuppressWarnings("unused")
		String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın

        
        
        int toplam = 0;

        for (int i = 0; i < elements.length; i++) {
			int element =(Integer.parseInt(elements[i]));
        	toplam += element;
		}
        if(toplam<0) {
        	toplam=-1;
        	System.out.println("Toplam : " + toplam);
        }else {
        	System.out.println("Toplam : " + toplam);

        }
		scanner.close();


    }
}
