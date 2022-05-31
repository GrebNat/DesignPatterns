package observer.exec;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class TrafficUpdate implements PropertyChangeListener {

    private ArrayList<String> updates = new ArrayList<>();

    public void getUpdates() {
        updates.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        updates.add((String) evt.getNewValue());
    }
}
