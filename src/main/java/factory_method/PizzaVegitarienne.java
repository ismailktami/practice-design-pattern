package factory_method;

public class PizzaVegitarienne extends Pizza {
    @Override
    public void preparer() {
        System.out.println("preparer pizza Vegitarienne");
    }

    @Override
    public void cuire() {
        System.out.println("cuire pizza Vegitarienne");

    }

    @Override
    public void couoper() {
        System.out.println("couper pizza Vegitarienne");

    }

    @Override
    public void emballer() {
        System.out.println("embaleer pizza Vegitarienne");

    }
}
