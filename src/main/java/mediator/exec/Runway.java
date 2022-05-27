package mediator.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Runway {

    boolean isAvailable;

    public Runway() {
        this.isAvailable = true;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
}
