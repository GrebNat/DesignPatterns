package behaviour.command.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class PrintCommand implements Command {

    private Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }
}
