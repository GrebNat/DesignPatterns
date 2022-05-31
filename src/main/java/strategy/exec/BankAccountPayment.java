package strategy.exec;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class BankAccountPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("paid via bank account " + amount);
    }
}
