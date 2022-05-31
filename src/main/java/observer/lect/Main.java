package observer.lect;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Connection sally = new Connection();
        Connection bob = new Connection();
        SocialMediaFeeds feeds = new SocialMediaFeeds();

        sally.addPropertyChangeListener(feeds);
        bob.addPropertyChangeListener(feeds);

        sally.setStatus("sleeping");
        bob.setStatus("eating");

        feeds.printStatuses();
    }
}
