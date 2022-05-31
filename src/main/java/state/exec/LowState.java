package state.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class LowState implements State {
    @Override
    public void turnUp(Fan fun) {
        fun.setState(new MediumState());
        System.out.println("turn to medium state");
    }

    @Override
    public void turnDown(Fan fun) {
       return;
    }
}
