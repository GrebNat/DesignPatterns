package behaviour.command.state.lect;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public interface State {
    void play(MediaPlayer player);
    void pause(MediaPlayer player);
}
