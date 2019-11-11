package proxy;

class RealTimeTweets implements Twitter
{
    private String twitterHandle;

    public RealTimeTweets(String twitterHandle)
    {
        this.twitterHandle = twitterHandle;
        
    }

    /**
     * Displays the Tweets
     */
    public void DisplayTweets()
    {
        System.out.println("Displaying tweets for " + twitterHandle);
    }
}
