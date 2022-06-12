package behaviour.command.observer.exec;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class City{
    private String trafficUpdate = "";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);


    public void updateTraffic(String trafficUpdate){
        support.firePropertyChange("trafficUpdate", this.trafficUpdate, trafficUpdate);
        this.trafficUpdate = trafficUpdate;
    }

    public void addPropertyListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}
