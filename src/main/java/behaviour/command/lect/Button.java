package behaviour.command.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Button {
    String text;

    public Button(String text) {
        this.text = text;
    }

    public void click(Command command) {
        command.execute();
    }
}
