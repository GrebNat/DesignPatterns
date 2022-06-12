package behaviour.command.template.lect;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        MeatPizza meatPizza = new MeatPizza();
        meatPizza.printInstruction();

        VegetarianPizza vegetarianPizza = new VegetarianPizza();
        vegetarianPizza.printInstruction();
    }
}
