package behaviour.command.strategy.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class Customer {

    public void  pay(int amount, Payment payment){
        payment.pay(amount);
    }
}
