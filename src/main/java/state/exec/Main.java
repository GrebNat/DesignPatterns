package state.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.turnUp();
        fan.turnUp();
        fan.turnDown();
        fan.turnDown();
        fan.turnUp();
    }
}
