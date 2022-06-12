package behaviour.command.visitor.lect;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        System.out.println(groceryList.getPrice());
        groceryList.accept(new DiscountVisitor());

        System.out.println(groceryList.getPrice());
    }
}
