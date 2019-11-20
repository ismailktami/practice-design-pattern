package State;

public class EtatApiece implements Etat{

    Distributeur distributeur;

    public EtatApiece(Distributeur d ){
        this.distributeur=d;
    }

    @Override
    public void insererPiece() {
        System.out.println("Vous ne pouvez pas inserer d'autre piece");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("piece retournée");
        distributeur.setEtat(distributeur.getEtatsanspiece());
    }

    @Override
    public void tournerPoigne() {
        System.out.println("Vous avez tourné...");
        distributeur.setEtat(distributeur.getEtatvendu());
    }

    @Override
    public void delivrer() {
        System.out.println("Pas de bonbon délivré");
    }
}
