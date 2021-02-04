package bridgepattern;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Red circle with radius:" + radius
                            + ", x:" + x + ", y:" + y);
    }
}
