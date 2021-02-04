package abstractfactorypattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape square = shapeFactory.getShape("square");
        square.draw();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape roundedSquare = roundedShapeFactory.getShape("square");
        roundedSquare.draw();
        Shape roundedRectangle = roundedShapeFactory.getShape("rectangle");
        roundedRectangle.draw();

    }
}
