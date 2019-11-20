package factory_method;

public class PizzaFromage extends Pizza {
    @Override
    public void preparer() {
        System.out.println("preparer pizza fromage");
    }

    @Override
    public void cuire() {
        System.out.println("cuire pizza fromage");

    }

    @Override
    public void couoper() {
        System.out.println("couper pizza fromage");

    }

    @Override
    public void emballer() {
        System.out.println("embaleer pizza fromage");

    }
}
