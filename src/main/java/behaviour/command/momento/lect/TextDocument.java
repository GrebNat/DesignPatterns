package behaviour.command.momento.lect;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class TextDocument {

    private String text = "";
    private Momento momento = new Momento(text);


    public void write(String text){
        this.text += text;
    }

    public void print(){
        System.out.println(text);
    }

    public void save(){
        momento.setState(text);
    }

    public void undo(){
        text = momento.getState();
    }
}
