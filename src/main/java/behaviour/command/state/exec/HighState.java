package behaviour.command.state.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class HighState implements State {
    @Override
    public void turnUp(Fan fun) {
        return;
    }

    @Override
    public void turnDown(Fan fun) {
        fun.setState(new MediumState());
        System.out.println("turn to medium behaviour.command.state");
    }
}
