package observer_from_video_turtorial;

import java.util.ArrayList;
import java.util.List;


public class Blog implements Subject
{
    List<Subscriber> observersList;
    private boolean stateChange;
    private String blogArticle;

    public Blog()
    {
        this.observersList = new ArrayList<Subscriber>();
        stateChange = false;
    }
    
	@Override
	public void registerObserver(Subscriber observer) {
		// TODO Auto-generated method stub
		observersList.add(observer);
		
	}

	@Override
	public void removeObserver(Subscriber observer) {
		// TODO Auto-generated method stub
		observersList.remove(observer);
		
	}


    public void postNewArticle()
    {
        this.blogArticle = "Hey! I met North West in Paris!";
        stateChange = true;
        notifyObservers();
    }

    public void notifyObservers()
    {

        if (stateChange)
        {
            for (Subscriber observer : observersList)
            {
                observer.updateUsers(blogArticle);
            }
        }
    }



	
}
