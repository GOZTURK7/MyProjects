package functionalinterface;

import java.util.function.Function;

public class _Function {


    public static void main(String[] args) {
      int increment=  incrementByOne(1);
        System.out.println(increment);

       int increment2= increamentByOneFunction.apply(1); // apply parametre alıyor.
        System.out.println(increment2);

        int multiply= multiplyBy10Function.apply(increment2); // multiply
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = increamentByOneFunction.andThen(multiplyBy10Function);

    }
                    //parameter, ReturnType                      parameter
    static Function<Integer, Integer> increamentByOneFunction = number -> number + 1; // aşağıdaki ile tamamen aynı

    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;

    static int incrementByOne(int number){
        return number +1;
    }
}
