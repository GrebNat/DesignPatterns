package behaviour.command.interpreter.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class StartWithCapitalLetter implements Expression {
    @Override
    public String interpret(String context) {
        context = context.substring(0,1).toUpperCase()+context.substring(1);

        return context;
    }
}
