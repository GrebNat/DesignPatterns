package behaviour.command.strategy.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.pay(100, new BankAccountPayment());
        customer.pay(5678, new PayPalmPayment());
    }
}
