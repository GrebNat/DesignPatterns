package structual.decorator.exec;

import java.util.ArrayList;

public class ExtraCheeseDecorator implements Pizza{
    ArrayList topping = new ArrayList<String>();
    Pizza pizza;

    public ExtraCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
        topping.addAll(pizza.getToppings());
        topping.add("cheese");

    }

    @Override
    public ArrayList getToppings() {
        return topping;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}
