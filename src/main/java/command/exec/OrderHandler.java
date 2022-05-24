package command.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class OrderHandler {
    public void invoke(Command command) {
        command.execute();
    }
}
