package adapter_head_first_2;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Client {


    public static void main(String[] args) {
        List<String> liste= Arrays.asList("hey","hey2","hey3");

        Enumeration enumeration=Collections.enumeration(liste);

        Iterator<String> iterator=new EnumerationIterator(enumeration);


        System.out.println(iterator.next());
        System.out.println(iterator.next());



            iterator.remove();


    }
}
