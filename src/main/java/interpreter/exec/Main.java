package interpreter.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        String context = "this is a sentence";

        context = new SentanceShouldEndsWithPeriod().interpret(context);
        context = new SentanceShouldEndsWithPeriod().interpret(context);
        context = new SentanceShouldEndsWithPeriod().interpret(context);

        System.out.println(context);
    }
}
