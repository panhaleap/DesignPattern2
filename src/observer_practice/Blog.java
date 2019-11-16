package observer_practice;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {
    List<Subscriber> observers;
    String article;
    boolean stateChange;
    public Blog(){
        this.observers = new ArrayList<>();
        this.stateChange = false;
    }
    @Override
    public void registerObserver(Subscriber observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Subscriber observer) {
        observers.remove(observer);
    }

    public void postNewArticle() {
        article = "I want to be healthy, smart, strong mind again!";
        stateChange = true;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        if(stateChange){
            for(Subscriber observer : observers){
                observer.updateUser(article);
            }
        }
    }
}
