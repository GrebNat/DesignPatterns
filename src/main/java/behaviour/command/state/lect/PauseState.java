package behaviour.command.state.lect;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class PauseState implements State{
    @Override
    public void play(MediaPlayer player) {
        player.setState(new PlayingState());
        player.setIcon("paused button");
        System.out.println("playing video icon is set to "+ player.getIcon());
    }

    @Override
    public void pause(MediaPlayer player) {

    }
}
