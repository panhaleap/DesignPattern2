package proxy;

class ProxyServer implements Twitter
{
    private RealTimeTweets tweets;
    private String twitterHandle;
    private String password;

    public ProxyServer(String twitterHandle, String password)
    {
        this.twitterHandle = twitterHandle;
        this.password = password;
    }

    /**
     * Authenticate password and displays the tweets 
     */
    public void DisplayTweets()
    {
        if (password.equals("Pass123"))
        {
            // Lazy loading. Fetch the tweets only if they are null. 
            if (tweets == null)
            {
                tweets = new RealTimeTweets(twitterHandle);
            }
            tweets.DisplayTweets();
        }
    }
}
