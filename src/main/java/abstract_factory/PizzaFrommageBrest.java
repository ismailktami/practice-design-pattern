package abstract_factory;

public class PizzaFrommageBrest extends Pizza {
    @Override
    public void preparer() {
        System.out.println("preparer pizza fromage brest" );
    }

    @Override
    public void cuire() {
        System.out.println("cuire pizza fromage brest");

    }

    @Override
    public void couoper() {
        System.out.println("couper pizza fromage brest");

    }

    @Override
    public void emballer() {
        System.out.println("embaleer pizza fromage brest");

    }
}
