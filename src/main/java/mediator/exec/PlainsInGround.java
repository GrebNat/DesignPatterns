package mediator.exec;

import java.util.LinkedList;
import java.util.List;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class PlainsInGround {
    List<String> ids;

    public PlainsInGround() {
        this.ids = new LinkedList<>();
    }

    public void removePlane(String planeId) {
        ids.remove(planeId);
    }
}
