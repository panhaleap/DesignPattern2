package observer_practice;

public class User implements Subscriber {
    String article;
    public User(Blog blog){
        blog.registerObserver(this);
    }
    @Override
    public void updateUser(String article) {
        this.article = article;
        System.out.println("State change reported by Subject.");
    }

    @Override
    public void printArticle() {
        System.out.println("Desktop browser : " + article);
    }
}
