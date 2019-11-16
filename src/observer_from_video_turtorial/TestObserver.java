package observer_from_video_turtorial;

public class TestObserver {
	
	public static void main(String[] args) {
    
        Blog blog = new Blog();
        User user1 = new User(blog);
        User user2 = new User(blog);
        
        user1.printArticle(); //nothing is printed
        user2.printArticle();

        blog.postNewArticle();

        user1.printArticle();
        user2.printArticle();
        
    }

}
