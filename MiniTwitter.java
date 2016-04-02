/*
Implement a simple twitter. Support the following method:

postTweet(user_id, tweet_text). Post a tweet.
getTimeline(user_id). Get the given user's most recently 10 tweets posted by himself, order by timestamp from most recent to least recent.
getNewsFeed(user_id). Get the given user's most recently 10 tweets in his news feed (posted by his friends and himself). Order by timestamp from most recent to least recent.
follow(from_user_id, to_user_id). from_user_id followed to_user_id.
unfollow(from_user_id, to_user_id). from_user_id unfollowed to to_user_id.

*/

/**
 * Definition of Tweet:
 * public class Tweet {
 *     public int id;
 *     public int user_id;
 *     public String text;
 *     public static Tweet create(int user_id, String tweet_text) {
 *         // This will create a new tweet object,
 *         // and auto fill id
 *     }
 * }
 */
public class MiniTwitter {
    HashMap<Integer,List<Tweet>> timelines;
    HashMap<Integer,List<Integer>> feeds;//only keeps 10 value per list.
    HashMap<Integer,List<Integer>> following;
    HashMap<Integer,List<Integer>> followBy;

    public MiniTwitter() {
        timelines = new HashMap<Integer,List<Tweet>>();
        feeds = new HashMap<Integer,List<Integer>>();
        following = new HashMap<Integer,List<Integer>>();
        followBy = HashMap<Integer,List<Integer>>();
    }

    // @param user_id an integer
    // @param tweet a string
    // return a tweet
    public Tweet postTweet(int user_id, String tweet_text) {
        List<Tweet> tl;
        if(timelines.containsKey(user_id))
            tl = timelines.get(user_id);
        else
            tl = new ArrayList<String>;
        tl.add(Tweet.create(user_id,tweet_text));

        if(followBy.containsKey(user_id)){
            List<Integer> followers = followBy.get(user_id);
            for(Integer id:followers){
                List<Integer> activeFeed;
                if(feeds.containsKey(id))
                    activeFeed = feeds.get(id);
                else 
                    activeFeed = new LinkedList<Integer>();
                if(activeFeed.size()==10)
                    activeFeed.poll();
                activeFeed.offer(user_id);
            }
        }

    }

    // @param user_id an integer
    // return a list of 10 new feeds recently
    // and sort by timeline
    public List<Tweet> getNewsFeed(int user_id) {
        List<Tweet> tl;
        if(timelines.containsKey(user_id))
            tl = timelines.get(user_id);
        else
            tl = new ArrayList<String>;
        List<Tweet> result = new ArrayList<Tweet>();
        for(int count=0,j=tl.size();i<10;i++){

        }
    }
        
    // @param user_id an integer
    // return a list of 10 new posts recently
    // and sort by timeline
    public List<Tweet>  getTimeline(int user_id) {
        List<String> tl;
        if(timelines.containsKey(user_id))
            tl = timelines.get(user_id);
        else
            tl = new ArrayList<String>;
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id follows to_user_id
    public void follow(int from_user_id, int to_user_id) {
        // Write your code here
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id unfollows to_user_id
    public void unfollow(int from_user_id, int to_user_id) {
        // Write your code here
    }
        }
}