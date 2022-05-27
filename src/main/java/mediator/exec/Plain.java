package mediator.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Plain {
    private boolean isInTheAir;
    private String id;

    public Plain(String id) {
        this.id = id;
        isInTheAir = false;
    }

    public boolean getIsInTheAir() {
        return isInTheAir;
    }

    public void setInTheAir(boolean inTheAir) {
        isInTheAir = inTheAir;
    }

    public String getId() {
        return id;
    }
}
