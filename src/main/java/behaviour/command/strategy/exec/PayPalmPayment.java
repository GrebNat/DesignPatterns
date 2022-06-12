package behaviour.command.strategy.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class PayPalmPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("pay pal pay " + amount);
    }
}
