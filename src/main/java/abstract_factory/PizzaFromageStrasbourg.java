package abstract_factory;

public class PizzaFromageStrasbourg extends Pizza {
    @Override
    public void preparer() {
        System.out.println("preparer pizza fromage strasbourrg");
    }

    @Override
    public void cuire() {
        System.out.println("cuire pizza fromage strasbourrg");

    }

    @Override
    public void couoper() {
        System.out.println("couper pizza fromage strasbourrg");

    }

    @Override
    public void emballer() {
        System.out.println("embaleer pizza fromage strasbourrg");

    }
}
