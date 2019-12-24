package composite;

public class Main {


    public static void main(String[] args) {
        ArithmeticExpression a1=new NumerciOperand(50);
        ArithmeticExpression a2=new CompositeOperand(new NumerciOperand(15),new CompositeOperand(new NumerciOperand(15),new NumerciOperand(55),'+'),'-');


        ArithmeticExpression arithmeticExpression=new CompositeOperand(a1,a2,'+');
        System.out.println(arithmeticExpression.getValue());



    }


}
