package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {


    public static void main(String[] args) {
      int increment=  incrementByOne(1);
        System.out.println(increment);
        // FUNCTİON takes 1 argument and produces 1 result
       int increment2= increamentByOneFunction.apply(1); // apply parametre alıyor.
        System.out.println(increment2);

        int multiply= multiplyBy10Function.apply(increment2); // multiply
        System.out.println(multiply);

        // CHAINING FUNCTİONS --> ZİNCİRLEME FOKSİYON andThen ile yapıyoruz
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = increamentByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));


        // BİFUNCTİON  takes 2 argument and produces 1 result
       System.out.println(incrementByOneAndMultiply(4,100)); // normal java method

       System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100)); // funcitoanl programmmign fonction

    }

    // FUNCTIONS
                    //parameter, ReturnType                      parameter
    static Function<Integer, Integer> increamentByOneFunction = (number) -> number + 1; // aşağıdaki ile tamamen aynı

    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;

    static int incrementByOne(int number){
        return number +1;
    }




    // BIFUNCTIONS

            //<parameter, parameter, returntype>
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
        (numberToIncrementByOne, numbertoMultiplyby)->(numberToIncrementByOne +1) * numbertoMultiplyby;


    static int incrementByOneAndMultiply(int number, int numToMultiply){
        return (number +1) * numToMultiply;
    }



}
