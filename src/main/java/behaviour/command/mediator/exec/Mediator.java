package behaviour.command.mediator.exec;

import static behaviour.command.mediator.exec.Data.*;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Mediator {

    public void takeOff(Plain plain){
        if (!plain.getIsInTheAir() && runway.getIsAvailable()){
            System.out.println("Plane " + plain.getId() + " is taking off...");
            plainsInGround.removePlane(plain.getId());
            plainsInFright.addPlane(plain.getId());
            plain.setInTheAir(true);
            runway.setIsAvailable(false);
        }
    }
}
