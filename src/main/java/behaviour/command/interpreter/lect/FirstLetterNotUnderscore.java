package behaviour.command.interpreter.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class FirstLetterNotUnderscore implements Expression {

    private FirstLetterIsLowerCase firstLetterIsLowerCase = new FirstLetterIsLowerCase();

    @Override
    public String interpret(String context) {
        if (context.startsWith("_")){
            context = context.substring(1);
        }

        return firstLetterIsLowerCase.interpret(context);
    }
}
