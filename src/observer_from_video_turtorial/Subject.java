package observer_from_video_turtorial;

//Publisher
public interface Subject {
	
	void registerObserver(Subscriber observer);
    void removeObserver(Subscriber observer);
    void notifyObservers();

}
