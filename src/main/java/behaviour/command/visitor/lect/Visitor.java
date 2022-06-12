package behaviour.command.visitor.lect;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public interface Visitor {
    void visit(Bread bread);
    void visit(Milk milk);
    void visit(GroceryList groceryList);
}
