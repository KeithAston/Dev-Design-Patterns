package nullobjectpattern;

public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer cust1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer cust2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer cust3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer cust4 = CustomerFactory.getCustomer("Laura");


        System.out.println("Customers");
        System.out.println(cust1.getName());
        System.out.println(cust2.getName());
        System.out.println(cust3.getName());
        System.out.println(cust4.getName());
    }

}
