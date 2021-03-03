package templatepattern;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Football();
        game.play();
        System.out.println();
        game = new Rugby();
        game.play();
    }

}
