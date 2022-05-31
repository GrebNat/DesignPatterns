package template.lect;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class MeatPizza extends Pizza {

    public void addToppings() {
        super.addToppings();
        System.out.println("add meat");
    }

    public void cook() {
        System.out.println("bake 20 min");
    }
}
