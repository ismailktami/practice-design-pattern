package adapter_head_first;

public class DindonSauvage implements Dindon {


    @Override
    public void glouglouter() {
        System.out.println("Glouglou");
    }

    @Override
    public void voler() {
        System.out.println("je ne vole pas loin");
    }
}
