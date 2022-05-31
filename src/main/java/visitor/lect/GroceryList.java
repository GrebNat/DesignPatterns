package visitor.lect;

import java.util.ArrayList;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class GroceryList implements Groceries {

    ArrayList<Groceries> groceries = new ArrayList<>();

    public GroceryList() {
        Bread bread = new Bread();
        Bread bread2 = new Bread();
        Milk milk = new Milk();
        groceries.add(bread);
        groceries.add(milk);
        groceries.add(bread2);
    }

    public double getPrice() {
        return groceries.stream().mapToDouble(Groceries::getPrice).sum();
    }

    @Override
    public void accept(Visitor visitor) {
        groceries.forEach(x -> x.accept(visitor));
        visitor.visit(this);
    }
}
