package observer;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo extends Thread implements Obeservable {
    private float pression,temperature,humidite;


    private List<Observer> observers=new ArrayList<Observer>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void rempveObserver(Observer o) {
    observers.remove(o);
    }

    public void notifyObserver() {
        observers.forEach(o->{ o.update(temperature,humidite,pression);});
    }

    public void setMesure(float p,float h, float t){
        temperature=t;pression=p;humidite=h;
        notifyObserver();
    }

    @Override
    public void run() {
        while(true){
            float temperature=(float)Math.random()*40;
            float pression=(float)Math.random()*2000 +150;
            float humidite=(float)Math.random()*100;
            setMesure(pression,humidite,temperature);
            try {
                Thread.sleep(2000);

            }
            catch (Exception e){
                System.err.println(e.toString());
            }
        }
    }
}
