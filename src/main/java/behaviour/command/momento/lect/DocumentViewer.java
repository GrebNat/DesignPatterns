package behaviour.command.momento.lect;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class DocumentViewer {

    static TextDocument textDocument = new TextDocument();

    public static void main(String[] args) {
        textDocument.write("hello");
        textDocument.save();
        textDocument.print();
        textDocument.write("world");
        textDocument.print();
        textDocument.undo();
        textDocument.print();
    }
}
