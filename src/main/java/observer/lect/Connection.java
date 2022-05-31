package observer.lect;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class Connection {

    public String status = "";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        support.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}
