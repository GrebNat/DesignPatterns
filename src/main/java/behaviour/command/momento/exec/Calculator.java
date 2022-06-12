package behaviour.command.momento.exec;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class Calculator {

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(10);
        System.out.println(adder.getResult());

        adder.save();
        adder.add(20);
        System.out.println(adder.getResult());

        adder.undo();
        System.out.println(adder.getResult());
    }
}
