package decorateur.entities.factory;

import decorateur.entities.Chocolat;
import decorateur.entities.Creme;
import decorateur.entities.composant.Boisson;
import decorateur.entities.composant.EspressoFes;
import decorateur.entities.composant.SumartaFes;

public class CafetteriaFes extends Caffeteria {


    public Boisson createBoisson(String type, String ...options)  {
        Boisson b=null;
        if(type.equals("espressofes"))
            b=new EspressoFes();

        else if(type.equals("sumartafes"))
            b=new SumartaFes();

       for(String s:options){
           if(s.equals("Chocolat")){
               b=new Chocolat(b);
           }
           else if(s.equals("Creme")){
               b=new Creme(b);
           }

       }
        return b;
    }

    public CafetteriaFes(){

    }

}
