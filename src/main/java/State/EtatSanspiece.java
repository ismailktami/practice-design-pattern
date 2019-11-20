package State;

public class EtatSanspiece implements Etat{

    Distributeur distributeur;

    public EtatSanspiece(Distributeur d ){
        this.distributeur=d;
    }

    @Override
    public void insererPiece() {
        System.out.println("piece inserer");
        distributeur.setEtat(distributeur.getEtatapiece());
    }

    @Override
    public void ejecterPiece() {
        System.out.println("please insert before....");
    }

    @Override
    public void tournerPoigne() {
        System.out.println("inutile de tourner....");
    }

    @Override
    public void delivrer() {
        System.out.println("Pas de bonbon délivré");

    }
}

