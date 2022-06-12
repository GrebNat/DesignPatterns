package behaviour.command.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class SaveCommand implements Command {

    private Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
