package _09_Arrays;

import java.util.Arrays;

public class Q17_Cozumlu {
    //  Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
//Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

    public static void main(String[] args) {
    	
    	
    	//int somun[]= {2,3,4,5,6,7,8}
    	
    	
    	  int[] arrSomun = {1, 3, 4, 5, 2};
          int[] arrCivata = {1, 2, 3, 6, 5};

          arrSomun = dizinYap(arrSomun);
          System.out.println(Arrays.toString(arrSomun));
          arrCivata = dizinYap(arrCivata);
          System.out.println(Arrays.toString(arrCivata));
          for (int i = 0; i < arrCivata.length; i++) {
              System.out.println("arrCivata = " + arrCivata[i] + "arrSomun :" + arrSomun[i]);
          }

      }

      public static int[] dizinYap(int[] arrA) {
          for (int i = 0; i < arrA.length; i++) {
              for (int j = 0; j < arrA.length; j++) {
                  if (arrA[i] < arrA[j]) {
                      int ef = arrA[i];
                      arrA[i] = arrA[j];
                      arrA[j] = ef;
                  }
              }
          }
          return arrA;

    }

}
