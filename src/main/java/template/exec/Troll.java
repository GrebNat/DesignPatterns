package template.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class Troll extends Enemy{
    @Override
    public void pickUp() {
        System.out.println("pick up club");
    }

    @Override
    public void defend() {
        System.out.println("defend with club");
    }

    @Override
    public void returnBack() {
        System.out.println("return to the mountain");
    }
}
