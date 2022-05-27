package momento.lect;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class Momento {

    private  String state;

    public Momento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
