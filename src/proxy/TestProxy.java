package proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		 Twitter tweet1 = new ProxyServer("@BillGates", "Pass123");
         Twitter tweet2 = new ProxyServer("@Oprah", "Pass1234");

         tweet1.DisplayTweets();
         tweet2.DisplayTweets();

	}

}
