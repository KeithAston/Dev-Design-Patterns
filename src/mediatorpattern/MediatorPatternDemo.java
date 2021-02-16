package mediatorpattern;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User rob = new User("Robert");
        User john = new User("John");

        rob.sendMessage("Hi John!");
        john.sendMessage("Hey Rob");
    }
}
