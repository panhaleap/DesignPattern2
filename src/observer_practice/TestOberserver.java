package observer_practice;

public class TestOberserver {
    public static void main(String[] args) {
        Blog blog = new Blog();
        User user1 = new User(blog);
        user1.printArticle();

        blog.postNewArticle();
        user1.printArticle();
    }
}
