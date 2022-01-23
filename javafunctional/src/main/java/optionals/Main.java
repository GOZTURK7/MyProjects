package optionals;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

//        Supplier<Object> objectSupplier = () -> "default value"; { ()->"default value" ifadesinin variabllı hali bu.}
        Optional.ofNullable(null).orElseGet(()-> "default value");

        Supplier<String> suplier = ()->"Gökhan";


        Supplier<Random> randomSupplier = () -> new Random();
        Supplier<Random> s1 = randomSupplier;



        Supplier<Random> s3 = Random::new;


        System.out.println(suplier.get());



    }
    static String g (String name){
        return name;
    }
}
