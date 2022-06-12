package behaviour.command.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class SalesOrderClient {

    private static Jacket jacket = new Jacket();

    public static void main(String[] args) {
        OrderHandler placeOrderHandler = new OrderHandler();
        OrderHandler returnOrderHandler = new OrderHandler();

        placeOrderHandler.invoke(new PlaceOrder(jacket));
        returnOrderHandler.invoke(new ReturnOrder(jacket));
    }
}
