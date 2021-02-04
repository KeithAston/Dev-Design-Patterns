package adapterpattern;

public class AbstractPatternDemo {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Solitaires");
        audioPlayer.play("mp4","Highest in the Room");
        audioPlayer.play("vlc", "La Vie en rose");
        audioPlayer.play("mlc", "BS file");
    }
}
