package observer;

public interface Obeservable {
    public void addObserver(Observer observer);
    public void  rempveObserver(Observer o);
    public void notifyObserver();

}
