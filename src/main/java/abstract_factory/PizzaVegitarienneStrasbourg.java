package abstract_factory;

public class PizzaVegitarienneStrasbourg extends Pizza {
    @Override
    public void preparer() {
        System.out.println("preparer pizza  vegitarienne strasbourg");
    }

    @Override
    public void cuire() {
        System.out.println("cuire pizza vegitarienne strasbourg");

    }

    @Override
    public void couoper() {
        System.out.println("couper pizza  vegitarienne strasbourg");

    }

    @Override
    public void emballer() {
        System.out.println("embaleer pizza  vegitarienne strasbourg");

    }
}
