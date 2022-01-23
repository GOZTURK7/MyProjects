package streams;



import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)


        );



        people.stream().map( person -> person.name)
                .collect(Collectors.toSet()) // toSet dublicate'leri çıkarıyor sadece farklı olanları Set veri tipinde listeliyor
                .forEach(System.out::println);



        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales =  people.stream()
                .anyMatch(personPredicate);

       System.out.println(containsOnlyFemales);


                                                        //map(person->person.name)
        //
        // FOKNSİYONLARIN VARİABLE'LARA ATANMIŞ HALİ ÇOK ÖNEMLİ KONUYU ANLAMAK İÇİN
        // option + command + L : extract variable (burada bunu kullanarak aşağıda variablelara atadık ='in sağındaki ifadeleri normalda methodların içindeydilerr.
        // option + command + İ : inline variabele
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;

        people.stream().
                map(personStringFunction)
                .mapToInt(length)
                .forEach(println);


        }
    public static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    public enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
