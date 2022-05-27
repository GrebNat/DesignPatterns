package momento.exec;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class Adder {
    private int result;
    private  Memento memento = new Memento(result);

    public void add(int num) {
        result += num;
    }

    public int getResult() {
        return result;
    }

    public void save() {
        memento.setState(result);
    }


    public void undo() {
        result = memento.getState();
    }
}
