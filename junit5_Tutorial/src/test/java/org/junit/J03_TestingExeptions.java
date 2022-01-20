package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J03_TestingExeptions {


/*
    assertThrow() metodu --> belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
    test eder.
    Dolayısıyla 2 parametre alır.
            1. parametre --> expected(beklenen) Exception(istisna) türü,
            2. parametre --> actual(oluşacak)  çalıştırılacak olan işlemdir.
    Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
    Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
    TRİCKK : Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
            */

@Test
    @DisplayName("NumberFormatExeption TEST")
    void testExeption01(){
//        String strSayi = "1453";
         String strSayi = "1a53";

   // assertThrows(Exception.class, ()-> Integer.parseInt(strSayi)); // failed
        assertThrows(Exception.class, ()-> Integer.parseInt(strSayi)); // passed -- dynamic
//    assertThrows(Exception.class, ()-> Integer.parseInt("573")); // failed --> dynamic değil tavsiye edilmez.

}


    @Test
    @DisplayName("NullFormatExeption TEST")
    void testExeption02(){
        String str = null;
        String str1 = "gökhan";
        assertThrows(NullPointerException.class, ()-> str.length()); // passed --
        assertThrows(NullPointerException.class, ()-> str1.length()); // failed --
    }


    @Test
    @DisplayName("IllegalArgumentExeption TEST")
        void testExeption03(){
         assertThrows(IllegalArgumentException.class, ()-> yasYazdir(-2)); // passed
//         assertThrows(IllegalArgumentException.class, ()-> yasYazdir(12)); // failed
    }
    void yasYazdir(int yas){
        if(yas<0){
            throw new IllegalArgumentException();
        }
    }

    @Test
    @DisplayName("ArithmeticExeption TEST")
    void testExeption04(){
        assertThrows(ArithmeticException.class, ()->bol(5,0)); // passed
        assertThrows(ArithmeticException.class, ()-> bol(5,1)); // failed
    }

    int bol(int a, int b){
        return a/b;
    }


}
