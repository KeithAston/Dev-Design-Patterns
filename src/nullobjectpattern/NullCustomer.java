package nullobjectpattern;

public class NullCustomer extends AbstractCustomer{

    @Override
    public String getName() {
        return "Not available in Customer DB";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
