package template.lect;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class VegetarianPizza extends Pizza {
    public void addToppings() {
        super.addToppings();
        System.out.println("add paper");
        System.out.println("add olive");
    }

    public void cook() {
        System.out.println("bake 15 min");
    }
}
