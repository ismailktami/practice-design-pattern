package State;

public class Client {

    public static void main(String[] args) {
        Distributeur d=new Distributeur(10);

        d.insererPiece();
        d.ejecterPiece();
        d.tournerPoigne();




        d.ejecterPiece();
        d.tournerPoigne();


        System.err.println(d.getNombre());



    }
}
