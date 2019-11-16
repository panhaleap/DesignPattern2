package observer_from_video_turtorial;

//subscribers to the blog
public class User implements Subscriber
{
    private String article;
    private Subject blog;

    public User(Subject blog)
    {
        this.blog = blog;
        this.blog.registerObserver(this);
    }

    public void updateUsers(String blogArticle)
    {
        this.article = blogArticle;
        System.out.println("State change reported by Subject.");

    }

    public void printArticle()
    {
        System.out.println("Desktop browser : " + this.article);
    }
}
