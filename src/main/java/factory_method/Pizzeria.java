package factory_method;

public class Pizzeria {

    public static void main(String[] args) {
        FactoryPizza factoryPizza = new FactoryPizza();
        Pizza p = factoryPizza.createPizza("frommage");
        Pizza p2 = factoryPizza.createPizza("vegitarienne");

        p.preparer();
        p2.couoper();
    }
}
