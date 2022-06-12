package behaviour.command.mediator.lect2;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Driver {
    public void deliver(String item, int quantity, Customer customer) {
        System.out.println(quantity + " of " + item + " was delivered to " + customer.getAddress());
    }
}
