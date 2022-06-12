package structual.decorator.exec;

import java.util.ArrayList;

public class PizzaPepperoni implements Pizza {

    static ArrayList toppings = new ArrayList<String>();
    static String name = "Pepperoni";

    public PizzaPepperoni() {
        toppings.add("tomato");
        toppings.add("pepperoni");
        toppings.add("cheese");
    }

    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return name;
    }
}
