package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    // Consumer<T> tek argument alıyor ama herhangi bir sonuç dönmüyor. Functional Programmingde

    public static void main(String[] args) {

        // Normal Java Function 1 parametreli: Structered Programming Method Using İn Main;
        greetCustomer(new Customer("Maria", "999999"));

        // CONSUMER : bir parametre alıyor ve sonucu yazdırıyor (normal methoddaki void return typı gibi)
        // Fonctional (Interface) Programming Consumer<parameter Type>
        greetCustomerConsumer.accept(new Customer("Maria", "999999"));



        // Normal Java Function 2 parametreli : Structered Programming Method Using İn Main;
        greetCustomerV2(new Customer("Maria", "999999"), false);

        //BİCONSUMER : iki parametre alıyor ve sonucu yazdırıyor (normal methoddaki void return typı gibi)
        Customer maria = new Customer("Maria", "999999");
        greetCustomerConsumerV2.accept(maria, false);

    }

    //Functional Programming Method
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+ customer.customerName +
                    ", thanks for registering phone number "  +
                    (showPhoneNumber ? customer.customerPhoneNumber : "***********"));

    // Structered Programming Method
    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber){
        System.out.println("Hello "+ customer.customerName +
                ", thanks for registering phone number "  +
                (showPhoneNumber ? customer.customerPhoneNumber : "**************"));
    }

    // Functional Progrramming Method
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+ customer.customerName +
            ", thanks for registering phone number "  +
            customer.customerPhoneNumber);

    // Structered Programming Method
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.customerName +
                ", thanks for registering phone number "  +
                customer.customerPhoneNumber );
    }



    static class Customer{

        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
