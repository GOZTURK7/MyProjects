package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {

    @Test
    @DisplayName("ToAssert Testi")
    void testToAssert() {
        int actual = "zekeriya".length();
        int beklenen = 8;

        //assertEquals(8, actual); // bu syntax ile yazıma "inline style" denir : her zaman kullanılmaz tavsiye edilmez interview sorusu
        // assertEquals(beklenen, actual);
        //assertEquals(actual, beklenen); // expected ve actual değer yer değiştirebilir
       // assertEquals(beklenen, actual,"Beklenen ve actual değer eşit değil"); // interview sorusu : yazılan mesaj hata durumunda (test failed) durumunda print olur sadece,

//        1)  assertEquals --> pozitif test : expected ve actual durumlarının eşit olmasını test eder eşit olması halinde test passed

        //assertEquals(4, "islam".length(), "inline style tavsiye edilmez cıssss.");


//        2)  assertNotEquals --> negatif test : expected ve actual durumlarının eşit OLMAMASINI test eder eşit olması halinde test passed

        assertNotEquals(9, actual);



//        3)  assertTrue --> pozitif test : oluşturulan şart (boolean) true ise test passed
        assertTrue(beklenen == actual); // passed

        beklenen=7;
        //assertTrue(beklenen==actual); // failed --> 7!=8



//        4)  assertFalse --> negatif test : oluşturulan şart (boolean) false ise test passed
        assertFalse(beklenen==actual);





    }

    @Test
    @DisplayName("ConvertUpper Testi")
    void testConvertUpper() {

        String beklenen = "ABDULLAH";
        String olusan = "abdullah".toUpperCase();

        assertEquals(beklenen, olusan); // test dataları eşit ise passed olur.

        beklenen ="ABDULLAh";
       // assertTrue(beklenen.equals(olusan), "eşit değil değerler"); // failed
        assertFalse(beklenen.equals(olusan)); // passed


        olusan = null;
        assertNull(olusan, "Oluşan değer null değil"); // passed


        //assertNotNull(olusan, "Oluşan değer null"); // failed


        olusan ="kursat";
        assertNotNull(olusan); //passed
    }


    @Test
    @DisplayName("ToContains test")
    void testToContain(){

        boolean olusan = "mustafa".contains("hi"); // false döner
        boolean beklenen = false;

        assertEquals(olusan, beklenen, "String değeri barındırmıyor."); // passed

    }

    @Test
    @DisplayName("Array Test")
    void testToArray(){

        String str = "javacanlara selam olsun ayagınıza das degmesin";
        String [] olusan = str.split(" ");
        String [] beklenen = {"javacanlara", "sela", "olsun", "ayagınıza", "das", "degmesin"};

        assertArrayEquals(olusan, beklenen, "Agam Arraylarin Farklı"); // passed
        assertArrayEquals(olusan, beklenen, "Agam Arraylarin Farklı"); // failed --> array contents differ at index [1], expected: <selam> but was: <sela>


    }

}
