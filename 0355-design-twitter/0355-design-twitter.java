import java.util.*;

class Twitter {

    private Map<Integer, List<Integer>> userTweets;
    private Map<Integer, Set<Integer>> followers;
    public List<Integer>al = new ArrayList<>();

    public Twitter() {
        userTweets = new HashMap<>();
        followers = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        userTweets.putIfAbsent(userId, new ArrayList<>());
        userTweets.get(userId).add(tweetId);
        al.add(tweetId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        if (userTweets.containsKey(userId)) {
            System.out.println("yes");
            HashSet<Integer> set = new HashSet<>(userTweets.get(userId));
            for (int followeeId : followers.getOrDefault(userId, new HashSet<>())) {
                if (userTweets.containsKey(followeeId)) {
                    set.addAll(userTweets.get(followeeId));
                }
            }
            List<Integer> asd = new ArrayList<>();

            for (int i = al.size() - 1; i >= 0; i--) {
                if (asd.size() == 10) {
                    return asd;
                }
                if (set.contains(al.get(i))) {
                    asd.add(al.get(i));
                }
            }
            return asd;
        } 
        else {
            return new ArrayList<>();
        }
}

    
    public void follow(int followerId, int followeeId) {
        if(!userTweets.containsKey(followerId)){userTweets.put(followerId,new ArrayList<>());}
        followers.putIfAbsent(followerId, new HashSet<>());
        followers.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (followers.containsKey(followerId)) {
            followers.get(followerId).remove(followeeId);
        }
    }
}
