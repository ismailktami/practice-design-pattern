package Command;

public class EtatEteingner implements Etat{
    Lampe lampe;

    public EtatEteingner(Lampe l){
        this.lampe=l;
    }
    @Override
    public void allumer() {
        lampe.setEtat(new EtatAllumer(lampe));
        System.out.println("Lampe allumée");
    }

    @Override
    public void eteindre() {
        System.out.println("Lampe déja  éteinte");

    }
}
