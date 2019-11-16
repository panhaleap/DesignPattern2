package observer_practice;

public interface Subject {
    public void registerObserver(Subscriber observer);
    public void removeObserver(Subscriber observer);
    public void notifyObservers();
}
