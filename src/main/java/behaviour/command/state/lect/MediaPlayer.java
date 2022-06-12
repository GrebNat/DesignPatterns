package behaviour.command.state.lect;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class MediaPlayer {
    private State state = new PauseState();
    private String icon = "play button";

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
       state.play(this);
    }

    public void pause() {
        state.pause(this);
    }
}
