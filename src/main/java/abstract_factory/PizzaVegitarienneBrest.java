package abstract_factory;

public class PizzaVegitarienneBrest extends Pizza {
    @Override
    public void preparer() {
        System.out.println("preparer pizza vegitarienne brest" );
    }

    @Override
    public void cuire() {
        System.out.println("cuire pizza  vegitarienne brest");

    }

    @Override
    public void couoper() {
        System.out.println("couper pizza  vegitarienne brest");

    }

    @Override
    public void emballer() {
        System.out.println("embaleer pizza  vegitarienne brest");

    }
}
