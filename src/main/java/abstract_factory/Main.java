package abstract_factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizzeria p1=new PizzeriaBrest();
        Pizzeria p2=new PizzeriaStrasbourg();

        Pizza pi1=p1.createPizza("frommage");

        Pizza pi2=p2.createPizza("vegitarienne");

        pi1.preparer();pi2.preparer();


        List l= Collections.synchronizedList(new ArrayList<Integer>());




    }
}
