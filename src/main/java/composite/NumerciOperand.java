package composite;

public class NumerciOperand extends ArithmeticExpression {

    int value;


    public NumerciOperand(){}
    public NumerciOperand(int value){this.value=value;}
    @Override
    public int getValue() {
        return value;
    }
}
