package structual.composite.lect;

import java.util.ArrayList;

public class SalesTeam implements Payee{

    ArrayList<Payee> payees = new ArrayList<>();

    public void addPayee(Payee payee){
        payees.add(payee);
    }

    public void payExpense(int amount){
        payees.forEach(x->x.payExpense(amount));
    }
}
