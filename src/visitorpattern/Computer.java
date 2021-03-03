package visitorpattern;

public class Computer implements ComputerPart{
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Monitor(), new Keyboard(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part : parts){
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
