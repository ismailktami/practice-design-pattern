package composite;

public class CompositeOperand  extends ArithmeticExpression{

    private ArithmeticExpression FirstarithmeticExpression;
    private ArithmeticExpression SecondearithmeticExpression;
    private char sign;



    public CompositeOperand(ArithmeticExpression f,ArithmeticExpression s , char sign){

        this.FirstarithmeticExpression=f;this.SecondearithmeticExpression=s;this.sign=sign;

    }

    public ArithmeticExpression getFirstarithmeticExpression() {
        return FirstarithmeticExpression;
    }

    public ArithmeticExpression getSecondearithmeticExpression() {
        return SecondearithmeticExpression;
    }

    public char getSign() {
        return sign;
    }

    public void setFirstarithmeticExpression(ArithmeticExpression firstarithmeticExpression) {
        FirstarithmeticExpression = firstarithmeticExpression;
    }

    public void setSecondearithmeticExpression(ArithmeticExpression secondearithmeticExpression) {
        SecondearithmeticExpression = secondearithmeticExpression;
    }

    @Override
    public int getValue() {
        switch(sign){
            case '+':        return getFirstarithmeticExpression().getValue()+getSecondearithmeticExpression().getValue();
            case '-':        return getFirstarithmeticExpression().getValue()-getSecondearithmeticExpression().getValue();
            case '*':        return getFirstarithmeticExpression().getValue()*getSecondearithmeticExpression().getValue();
            case '/':        return getFirstarithmeticExpression().getValue()/getSecondearithmeticExpression().getValue();
            default :        throw new RuntimeException("Error operation");
        }
    }
}
