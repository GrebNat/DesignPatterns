package template.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public abstract class Enemy {

    public void pickUp() {
    }

    public void defend() {
    }

    public void returnBack() {
    }

    public void defentAgainstAttach() {
        pickUp();
        defend();
        returnBack();
    }
}
