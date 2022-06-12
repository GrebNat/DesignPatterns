package behaviour.command.state.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class Fan {

    public void setState(State state) {
        this.state = state;
    }

    private State state = new LowState();


    public void turnUp(){
        state.turnUp(this);
    }
    public void turnDown(){
        state.turnDown(this);
    }
}
