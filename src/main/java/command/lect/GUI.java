package command.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class GUI {

    private static Document document = new Document();

    public static void main(String[] args) {
        Button saveButton = new Button("save");
        Button printButton = new Button("print");

        saveButton.click(new SaveCommand(document));
        printButton.click(new PrintCommand(document));
    }
}
