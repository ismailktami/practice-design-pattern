package adapter_head_first;

public class Client {
    public static void main(String[] args) {
        Canard c=new Covert();
        c.cancaner();
        c.voler();
        Dindon d=new DindonSauvage();

        c=new AdapterDindion(d);

        System.err.println("Je suis devenu DINDON sheet");
        c.voler();
        c.cancaner();
    }
}
