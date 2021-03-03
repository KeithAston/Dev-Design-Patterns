package templatepattern;

public class Rugby extends Game{

    @Override
    void endPlay() {
        System.out.println("Rugby game closing");
    }

    @Override
    void initialize() {
        System.out.println("Rugby game setting up");
    }

    @Override
    void startPlay() {
        System.out.println("Rugby game ready to play");
    }
}
