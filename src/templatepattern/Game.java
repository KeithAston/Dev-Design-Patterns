package templatepattern;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        //initialise the game
        initialize();
        //start the game
        startPlay();
        //end the game
        endPlay();
    }
}
