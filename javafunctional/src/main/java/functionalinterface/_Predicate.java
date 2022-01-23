package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        // NORMAL
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        // PREDİCATE : functional programming (boolean
        System.out.println("With Predicate ");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

       // CHAİNİNG PREDİCATE METHODS WİTH 'and ' ve 'or' (burada aynı zamanda antThen de kullanabiliriz Function'daki gibi
        // 1 - ) WİTH 'and':
       System.out.println("Is Phone Number valid and contains number 3 = "
               +isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300")); // false

        System.out.println("Is Phone Number valid and contains number 3 = "
                +isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003")); // true
        // 2 - ) WİTH 'or':
        System.out.println("Is Phone Number valid or contains number 3 = "
                +isPhoneNumberValidPredicate.or(containsNumber3).test("09009877300")); // true

        System.out.println("Is Phone Number valid or contains number 3 = "
                +isPhoneNumberValidPredicate.or(containsNumber3).test("00700000000")); // false

        // BIPREDİCATE :
        System.out.println("BiPredicate");
        System.out.println("Is Name = Gokhan and Mark=50 "+ isNameGokhanAndMark50.test("Gokhan", 50)); // true
        System.out.println("Is Name = Gokhan and Mark=50 "+ isNameGokhanAndMark50.test("Gökhan", 50)); // false


    }
    // NORMAL METHOD
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }

    // PREDICATE :
                    //Predicate<parameter data type>           parameter
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber->
            phoneNumber.startsWith("07") && phoneNumber.length()==11; // returns boolean result çünkü Predicate interface bunu yapıyor.

    static Predicate<String> containsNumber3 = phoneNumber->phoneNumber.contains("3");

   // BIPREDICTE :
    static BiPredicate<String, Integer> isNameGokhanAndMark50 = (name, mark)->
            (name.equals("Gokhan") && mark==50);
}
