package interpreter.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        String context = "_Int";

        FirstLetterNotUnderscore firstLetterNotUnderscore = new FirstLetterNotUnderscore();

        context = firstLetterNotUnderscore.interpret(context);
        System.out.println(context);
    }
}
