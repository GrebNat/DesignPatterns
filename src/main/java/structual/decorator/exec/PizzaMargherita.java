package structual.decorator.exec;

import java.util.ArrayList;

public class PizzaMargherita implements Pizza {
    static ArrayList toppings = new ArrayList<String>();
    static String name = "Margherita";

    public PizzaMargherita() {
        toppings.add("tomato");
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
