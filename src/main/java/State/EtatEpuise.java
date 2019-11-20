package State;

public class EtatEpuise implements Etat {
    Distributeur distributeur;

    public EtatEpuise(Distributeur d ){
        this.distributeur=d;
    }

    @Override
    public void insererPiece() {
    }

    @Override
    public void ejecterPiece() {

    }

    @Override
    public void tournerPoigne() {

    }

    @Override
    public void delivrer() {
        System.out.println("Pas de bonbon délivré");

    }
}
