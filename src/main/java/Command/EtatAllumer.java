package Command;

public class EtatAllumer implements Etat {
    Lampe lampe;
    public EtatAllumer(Lampe l){
        this.lampe=l;
    }
    @Override
    public void allumer() {
        System.out.println("Lampre déja allumer");
    }

    @Override
    public void eteindre() {
        lampe.setEtat(new EtatEteingner(lampe));
        System.out.println("Lampre  éteinte");


    }
}
