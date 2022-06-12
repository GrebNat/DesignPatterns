package behaviour.command.interpreter.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class NameNotPrimitiveType implements Expression {
    @Override
    public String interpret(String context) {
        if (context.equals("int") || context.equals("boolean") || context.equals("double")) {
            context = context + "1";
        }

        return context;
    }
}
