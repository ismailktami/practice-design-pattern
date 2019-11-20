package State;

public class EtatVendu implements Etat {

    Distributeur distributeur;

    public EtatVendu(Distributeur d ){
        this.distributeur=d;
    }
    @Override
    public void insererPiece() {
        System.out.println("Vous patientez le bonbon va tomber");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Vous avez déja tourner la poignée");
    }

    @Override
    public void tournerPoigne() {
        System.out.println("Insert before eject");
    }

    @Override
    public void delivrer() {

        distributeur.libere();
        if(distributeur.getNombre()>0)
            distributeur.setEtat(distributeur.getEtatsanspiece());
         else
             distributeur.setEtat(distributeur.getEtatEpuise());
        }

}
