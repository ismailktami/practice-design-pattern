package observer;

public class Application {


    public static void main(String[] args) {
        DonneesMeteo dm=new DonneesMeteo();

        Observer o1=new AfficherConditions();
        dm.addObserver(o1);


        Observer o2=new AfficherPrevisions();
        dm.addObserver(o2);
/*
        dm.setMesure(1000,60,44);
        dm.setMesure(2000,40,32);

        dm.setMesure(15000,14,30);
*/
        dm.start();
    }
}
