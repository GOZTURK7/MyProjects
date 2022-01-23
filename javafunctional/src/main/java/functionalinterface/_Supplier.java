package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    // Supplier istediğin herhangi tipte bir değerin return edilmesini sağlar ()->

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlSupplier2.get());


    }



    static String getDBConnectionUrl(){
        return "jdbc://loalhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = ()-> "jdbc://loalhost:5432/users";

    // eğer bir liste'yi döndürmesini istersek
    static Supplier<List<String>> getDBConnectionUrlSupplier2 = ()->
            List.of("jdbc://loalhost:5432/users",
            "jdbc://loalhost:5432/users");


}


