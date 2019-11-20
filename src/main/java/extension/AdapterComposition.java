package extension;

import adapter.StandarImplAdapte;
import adapter.StandarInterface;

public class AdapterComposition implements StandarInterface {
    private StandarImplAdapte ss=new StandarImplAdapte();

    public int operation(int nb1, int nb2) {
        return ss.operation2(nb1, nb2)+ss.operation3(nb1, nb2);
    }
}
