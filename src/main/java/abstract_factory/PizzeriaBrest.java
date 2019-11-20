package abstract_factory;


public class PizzeriaBrest extends Pizzeria {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("frommage")){
            return new PizzaFrommageBrest();
        }
        else if(type.equals("vegitarienne")){
            return new PizzaVegitarienneBrest();

        }
        else{
            return null;
        }    }
}
