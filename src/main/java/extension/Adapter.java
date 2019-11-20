package extension;

import adapter.StandarImplAdapte;
import adapter.StandarInterface;
import adapter.StandardImpl;

public class Adapter extends StandarImplAdapte implements StandarInterface {


    public int operation(int nb1, int nb2) {
        return operation2(nb1,nb2)+operation3(nb1,nb2);
    }
}
