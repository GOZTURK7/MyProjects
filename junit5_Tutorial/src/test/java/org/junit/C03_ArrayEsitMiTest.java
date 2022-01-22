package org.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class C03_ArrayEsitMiTest {

    @ParameterizedTest
    @MethodSource("arraySaglayici")
    void arrayKıyasla(boolean sonuc, Object[] x, Object[] y) {
        assertEquals(sonuc, C03_ArrayEsitMi.arrayKıyasla(x,y));
//        arrraySaglayici methoddan gelen boolean ve obj[] aray parametreleri eşit mi metoduna gönderip eşitliği iddia edilen sorgu;
    }

            // return type
    static Stream<Arguments> arraySaglayici(){ // Trick: return tek parametre için döndürülürken Stream<Arguments>
                                        // komut ile 3 parametre return eder.
                                         // arraySaglayici() --> methodu Stream Class'ına Argument parametreleri return eder.
        Integer[] a1 = {1,2,3,4};
        Integer[] a2 = {4,3,2,1};

        String[] s1 = {"h", "a", "y"};
        String[] s2 = {"h", "y", "a"};

        Double [] d1 = {1.2, 2.3, 5.6};
        Double [] d2 = {5.6, 2.3, 1.2};

        Float [] f1={1f,2f,67f,35f};
        Float [] f2={11f,20f,67f,35f};


    return Stream.of(Arguments.of(true, a1, a2),
                    Arguments.of(true, s1, s2),
                    Arguments.of(true, d1, d2),
                    Arguments.of(false, f1, f2));
    }

}