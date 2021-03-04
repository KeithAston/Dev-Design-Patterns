package servicelocatorpattern;

public class InitialContext {
    public Object lookup(String jndiName){
        if (jndiName.equalsIgnoreCase("Service1")){
            System.out.println("Looking up and createing new Service1 object");
            return new Service1();
        }
        else if (jndiName.equalsIgnoreCase("Service2")){
            System.out.println("Looking up and createing new Service2 object");
            return new Service2();
        }
        return null;
    }
}
