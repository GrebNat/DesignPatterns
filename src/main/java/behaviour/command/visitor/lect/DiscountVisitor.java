package behaviour.command.visitor.lect;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class DiscountVisitor implements Visitor {

    @Override
    public void visit(Bread bread) {
        bread.setPrice(0.9);
    }

    @Override
    public void visit(Milk milk) {
        milk.setPrice(1.6);
    }

    @Override
    public void visit(GroceryList groceryList) {
        System.out.println("Discount is applied to your grocery list");
    }
}
