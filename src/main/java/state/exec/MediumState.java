package state.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class MediumState implements State {
    @Override
    public void turnUp(Fan fun) {
        fun.setState(new HighState());
        System.out.println("turn to high state");
    }

    @Override
    public void turnDown(Fan fun) {
        fun.setState(new LowState());
        System.out.println("turn to low state");
    }
}
