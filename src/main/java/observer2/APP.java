package observer2;

import java.util.Observer;

public class APP {
    public static void main(String[] args) {
        EventSource evSrc=new EventSource();
        ResponseHandler responseHandler=new ResponseHandler();
        evSrc.addObserver((Observer) responseHandler);
        evSrc.run();
    }
}
