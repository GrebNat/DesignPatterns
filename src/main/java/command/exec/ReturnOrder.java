package command.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class ReturnOrder implements Command {
    private final Jacket jacket;

    public ReturnOrder(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        jacket.returnOrder();
    }
}
