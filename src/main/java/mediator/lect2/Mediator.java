package mediator.lect2;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Mediator {
    private Customer customer;
    private ECommerceSite site;
    private Driver driver;

    public Mediator() {
        customer = new Customer("123 Sunny Street");
        site = new ECommerceSite();
        driver = new Driver();
    }

    public void buy(String item, int quantity) {
        if (site.checkInStock(item, quantity)) {
            site.sell(item, quantity);
        }

        driver.deliver(item, quantity, customer);
    }
}
