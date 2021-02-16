package interpreterpattern;

public class InterpreterPatternDemo {

    public static Expression getMaleExpression(){
        Expression rob = new TerminalExpression("Rob");
        Expression john = new TerminalExpression("John");
        return new OrExpression(rob,john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.printf("Julie is a married female? " + isMarriedWoman.interpret("Married Julie"));
    }

}
