package decorateur.entities;

import decorateur.entities.composant.Boisson;
import decorateur.entities.composant.EspressoFes;
import decorateur.entities.factory.CafetteriaFes;
import decorateur.entities.factory.Caffeteria;

public class Client {

    public static void main(String[] args) {
        Boisson b=new EspressoFes();
        System.out.println( b.getDescription()+"    cout :"+ b.cout());
        b=new Chocolat(b);
        System.out.println( b.getDescription()+"    cout :"+ b.cout());
        b=new Creme(b);
        System.out.println( b.getDescription()+"    cout :"+ b.cout());


        Caffeteria c1=new CafetteriaFes();

        Boisson b1=c1.createBoisson("espressofes","Chocolat","Creme");

        System.err.println( b1.getDescription()+"    cout :"+ b.cout());



    }



}
