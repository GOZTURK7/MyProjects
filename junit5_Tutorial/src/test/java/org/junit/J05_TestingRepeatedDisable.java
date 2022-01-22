package org.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J05_TestingRepeatedDisable {

    @AfterEach
    void afterMethod(){
        System.out.println(" after çalıştı");
        System.out.println(" ***************");
    }


    @BeforeEach
    void beforeMethod(){
        System.out.println(" before çalıştı");
        System.out.println(" ***************");
    }

    @RepeatedTest(5)
    @DisplayName(" Contains test 5 kez run edilir.")
    void testToContain(){

        boolean olusan = "mustafa".contains("hi"); // false döner
        boolean beklenen = false;
        assertEquals(olusan, beklenen, "String değeri barındırmıyor.");
        System.out.println(" Contains test çalıştı");

    }

    @RepeatedTest(7)
    @DisplayName(" topla test 7 kez run edilir.")

    void topla(){
        assertEquals(5,(2+3));
        System.out.println(" topla test çalıştı");
    }


    @Disabled
    @Test
    void kurpuzTest(){
        String karpuz = "Adana karpuzu güldürür yüzü";
        assertEquals(28, karpuz.length());
    }







}
