package factory_method;

public class FactoryPizza {

    public Pizza createPizza(String type) {
        if(type.equals("frommage")){
            return new PizzaFromage();
        }
        else if(type.equals("vegitarienne")){
            return new PizzaVegitarienne();

        }
        else{
            return null;
        }
    }
}
