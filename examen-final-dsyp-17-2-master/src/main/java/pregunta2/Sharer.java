package pregunta2;

public class Sharer {
    RedditPoster redditPoster = new RedditPoster();
    
    public void shareEveryWhere(String message)
    {
        for (SharerType sharerType : SharerType.values()) {
            Sharing sharer = SharerFactory.FACTORY.getSharer(sharerType);
            if (sharer != null) {
                sharer.share(message);
            }
        }
        //Also share on Reddit
        redditPoster.post(message);
    }
    
    public void share(String message, SharerType sharerType)
    {
        if (sharerType == SharerType.Reddit) {
            redditPoster.post(message);
        } else {
            Sharing sharer = SharerFactory.FACTORY.getSharer(sharerType);
            sharer.share(message);
        }
    }
}
