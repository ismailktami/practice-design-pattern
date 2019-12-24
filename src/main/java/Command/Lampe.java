package Command;

public class Lampe {
    public Lampe(){
        this.etat=new EtatEteingner(this);
    }
    private Etat etat;
    public Etat getEtat() {
        return etat;
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void allumer(){
            etat.allumer();
    }
    public void eteindre() {
            etat.eteindre();
    }
}
