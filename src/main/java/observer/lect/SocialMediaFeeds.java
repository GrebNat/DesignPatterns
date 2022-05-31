package observer.lect;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class SocialMediaFeeds implements PropertyChangeListener {
    private ArrayList<String> statuses = new ArrayList<>();

    public void printStatuses(){
        statuses.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        statuses.add((String) evt.getNewValue());
    }
}
