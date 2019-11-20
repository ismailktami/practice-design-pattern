package observer;

public class AfficherConditions implements Observer {
    @Override
    public void update(float t, float h, float p) {
        System.err.println("--------------Aff Conditions actuelles----------------");
        System.out.println("Temperature est "+t+"  pression est "+p+"  humidite est  "+h);
        System.out.println("--------------------------------------------");

    }
}
