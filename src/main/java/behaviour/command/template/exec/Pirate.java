package behaviour.command.template.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class Pirate extends Enemy {
    @Override
    public void pickUp() {
        System.out.println("pick up sword");
    }

    @Override
    public void defend() {
        System.out.println("defend with sword");
    }

    @Override
    public void returnBack() {
        System.out.println("return to the schip");
    }
}
