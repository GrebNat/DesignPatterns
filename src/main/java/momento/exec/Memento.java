package momento.exec;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class Memento {
    private int state;

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
