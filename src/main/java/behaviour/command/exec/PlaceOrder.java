package behaviour.command.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class PlaceOrder implements Command {
    private final Jacket jacket;

    public PlaceOrder(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        jacket.placeOrder();
    }
}
