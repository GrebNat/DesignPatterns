package structual.decorator.exec;

public class Main {
    public static void main(String[] args) {
        order(new ExtraCheeseDecorator(new PizzaHawaii()));
        order(new PizzaMargherita());
        order(new PizzaPepperoni());
    }

    public static void order(Pizza pizza) {
        System.out.println("U have ordered pizza with toppings" + pizza.getToppings() + " " + pizza.getName());
    }
}
