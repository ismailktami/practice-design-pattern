package decorateur.entities;

import decorateur.entities.composant.Boisson;

public class Chocolat extends DecorateurIngredient {
    Boisson boisson;
    @Override
    public String getDescription() {
        return boisson.getDescription()+" chocolat";
    }
    @Override
    public double cout() {
        return boisson.cout()+3;
    }
    public Chocolat(Boisson b){
        this.boisson=b;
    }


}
