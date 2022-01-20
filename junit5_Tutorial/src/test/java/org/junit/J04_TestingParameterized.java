package org.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J04_TestingParameterized {

@Test
// CISSSS asla tavsiye edilmez --> failed olan testten sonra kalan testler run olamayacağı için defect bulunmaz
    void uzunlukSifirdanByk(){
        assertTrue("yildiz".length()>0);
        assertTrue("suleymen".length()>3);
        assertTrue("omer".length()>2);
        assertTrue("kursat".length()>4);

    }


//    TEKİL SART ....
    /*
    length() methodu ile aşağıdaki sartlar için 0'dan büyük değer return ettiğini test ediniz
    şartlar : "yıldız", "suleyman" , "omer", "kursat" ---> bu datalar testi nasıl geçer
     */

    @ParameterizedTest
//        @ValueSource(strings = {"yıldız", "suleyman", "omer", "kursat"}) // passed
        @ValueSource(strings = {"yıldız", "suleyman" ,"x", "omer", "kursat"}) // failed

        void uzunlukSifirdanBykParametreli(String str){ // @ValueSource(strings = {"yıldız", "suleyman" , "omer", "kursat"}) parametre elemanları
                                        //methoda parametre olarak döngüye girerek run olur.
        assertTrue(str.length()>2);

    }

//    ÇOKLU ŞART --> Her parametre elemanı KEY VALUE ikilisi ile test methodunda run edilir.


    @ParameterizedTest
    //    CSV : comma-separated values--> virgülle ayrılmış değerler
    @CsvSource (value = {"yıldız, YILDIZ", "suleyman, SULEYMAN", "omer, OMER", "kursat, KURSAT"})
    void testBykHrfCvr(String beklenenBykHrf, String isim){
        assertEquals(beklenenBykHrf.toUpperCase(), isim);
    }


}
