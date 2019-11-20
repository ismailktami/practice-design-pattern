package decorateur;

import decorateur.composant.Boisson;

public class Creme extends DecorateurIngredient {
    Boisson boisson;

    public Creme(Boisson boisson){
        this.boisson=boisson;
    }

    @Override
    public double cout() {
        return boisson.cout()+5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" creme";
    }
}
