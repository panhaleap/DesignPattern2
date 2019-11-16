package observer_from_video_turtorial;

//Observer
public interface Subscriber {
	
	//blogArticle - values the observer gets from the subject.
    void updateUsers(String blogArticle);
    void printArticle();

}
