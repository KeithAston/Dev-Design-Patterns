package visitorpattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
