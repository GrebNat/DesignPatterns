package structual.decorator.exec;

import java.util.ArrayList;

public class PizzaHawaii implements Pizza{
    static ArrayList toppings = new ArrayList<String>();
    static String name = "Hawaii";

    public PizzaHawaii() {
        toppings.add("pineaple");
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
