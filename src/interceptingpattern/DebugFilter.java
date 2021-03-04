package interceptingpattern;

public class DebugFilter implements Filter{

    @Override
    public void execute(String request) {
        System.out.println("Request Log: " + request);
    }
}
