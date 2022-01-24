package optionals;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

//        Supplier<Object> objectSupplier = () -> "default value"; { ()->"default value" ifadesinin variabllı hali bu.}
        Optional.ofNullable(null).orElseGet(()-> "default value");
//        filter() ---> If a value is present, and the value matches the given predicate,
//        returns an Optional describing the value, otherwise returns an EMPTY OPTIONAL (not false):


        Supplier<String> suplier = ()->"Gökhan";


        Supplier<Random> randomSupplier = () -> new Random();
        Supplier<Random> s1 = randomSupplier;

        var per = 5;
        System.out.println(per);

        Supplier<Random> s3 = Random::new;


        System.out.println(suplier.get());



    }
    static String g (String name){
        return name;
    }
}
