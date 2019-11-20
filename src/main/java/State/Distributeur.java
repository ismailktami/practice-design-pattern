package State;

public class Distributeur {
    Etat etatapiece;
    Etat etatvendu;
    Etat etatsanspiece;
    Etat etatEpuise;
    Etat etat;
    int nombre=0;

    public Distributeur(int nbnb){
        etatapiece=new EtatApiece(this);
        etatvendu=new EtatVendu(this);
        etatsanspiece=new EtatSanspiece(this);
        etatEpuise=new EtatApiece(this);

        this.nombre=nbnb;
        if(this.nombre>0)
            etat=etatsanspiece;
        else
            etat=etatEpuise;

    }

    public int getNombre() {
        return nombre;
    }

    public Etat getEtat() {
        return etat;
    }

    public void insererPiece(){
        etat.insererPiece();
    }

    public void ejecterPiece(){
        etat.ejecterPiece();
    }
    public void tournerPoigne(){
        etat.tournerPoigne();
        etat.delivrer();
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }


    public void libere(){
        System.out.println("Un bonbon va sortir....");
        if(nombre!=0)
            nombre--;
    }

    public Etat getEtatapiece() {
        return etatapiece;
    }

    public Etat getEtatvendu() {
        return etatvendu;
    }

    public Etat getEtatsanspiece() {
        return etatsanspiece;
    }

    public Etat getEtatEpuise() {
        return etatEpuise;
    }
}
