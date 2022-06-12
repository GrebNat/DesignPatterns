package behaviour.command.state.lect;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class PlayingState implements State{
    @Override
    public void play(MediaPlayer player) {

    }

    @Override
    public void pause(MediaPlayer player) {
        player.setState(new PauseState());
        player.setIcon("play button");
        System.out.println("paused video icon is set to "+ player.getIcon());
    }
}
