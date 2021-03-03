package businessdelegatepattern;

public class BusinessLookup {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("JMS")){
            return new JMSService();
        } else {
            return new EJBService();
        }
    }
}
