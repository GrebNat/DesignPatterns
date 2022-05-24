package interpreter.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class ContainsNoReperedWords implements Expression {

    StartWithCapitalLetter startWithCapitalLetter = new StartWithCapitalLetter();

    @Override
    public String interpret(String context) {
        context = startWithCapitalLetter.interpret(context);

        List<Integer> indexesToRemove = new LinkedList<>();
        List<String> contextList = Arrays.asList(context.split(" ").clone());

        for (int i = 1; i < contextList.size(); i++) {
            if(contextList.get(i).equals(contextList.get(i-1)))
                indexesToRemove.add(i);
        }

        for (int i = indexesToRemove.size()-1; i >= 0 ; i--) {
            contextList.remove(i);
        }
        return context;
    }
}
