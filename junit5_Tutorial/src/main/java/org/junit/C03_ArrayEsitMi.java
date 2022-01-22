package org.junit;

import java.util.Arrays;

public class C03_ArrayEsitMi {

    public static boolean arrayKıyasla(Object [] a, Object[] b){

        Arrays.sort(a);
        Arrays.sort(b);
        return  Arrays.equals(a,b);
    }


}
