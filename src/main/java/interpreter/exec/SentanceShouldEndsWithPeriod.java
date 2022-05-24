package interpreter.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class SentanceShouldEndsWithPeriod implements Expression {

    ContainsNoReperedWords containsNoReperedWords = new ContainsNoReperedWords();

    @Override
    public String interpret(String context) {
        context = containsNoReperedWords.interpret(context);

        if (!context.endsWith("..."))
            context = context + "...";

        return context;
    }
}
