package adapter;

import extension.Adapter;
import extension.AdapterComposition;

public class Client {

    public static void main(String[] args) {
        System.err.println("Heritage");

        StandarInterface i=new Adapter();
        System.out.println(i.operation(4,1));


        System.err.println("Compostion");
        StandarInterface iii=new AdapterComposition();
        System.out.println(iii.operation(4,1));



        System.err.println("Implemenatation Standard");

        StandarInterface ii=new StandardImpl();
        System.out.println(ii.operation(4,1));

    }
}
