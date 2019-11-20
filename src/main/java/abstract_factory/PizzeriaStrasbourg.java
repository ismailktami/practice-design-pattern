package abstract_factory;

public class PizzeriaStrasbourg extends Pizzeria {
    @Override
    public Pizza createPizza(String type) {
          if(type.equals("frommage")){
            return new PizzaFromageStrasbourg();
        }
        else if(type.equals("vegitarienne")){
            return new PizzaVegitarienneStrasbourg();

        }
        else{
            return null;
        }
    }
}
