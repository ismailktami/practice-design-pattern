package observer2;


import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer {
    private String rep;
    @Override
    public void update(Observable obj, Object arg) {
        if(arg instanceof String  )
        {
            rep=(String) arg;
            System.err.println("\n Received Response \t "+rep);
        }
    }
}
