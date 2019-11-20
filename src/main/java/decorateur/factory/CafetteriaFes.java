package decorateur.factory;

import decorateur.Chocolat;
import decorateur.Creme;
import decorateur.composant.Boisson;
import decorateur.composant.EspressoFes;
import decorateur.composant.SumartaFes;

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
