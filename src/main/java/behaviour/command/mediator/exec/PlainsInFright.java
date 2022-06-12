package behaviour.command.mediator.exec;

import java.util.LinkedList;
import java.util.List;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class PlainsInFright {
    List<String> ids;

    public PlainsInFright() {
        this.ids = new LinkedList<>();
    }

    public void addPlane(String plainId) {
        this.ids.add(plainId);
    }
}
