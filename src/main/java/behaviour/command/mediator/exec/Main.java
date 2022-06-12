package behaviour.command.mediator.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Main {

    public static void main(String[] args) {
       Plain plain = new Plain("123");
       new Mediator().takeOff(plain);
    }
}
