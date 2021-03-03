package businessdelegatepattern;

public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("JMS");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("EJB");
        client.doTask();

    }
}
