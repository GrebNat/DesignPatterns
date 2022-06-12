package structual.composite.lect;

public class ExpensesClient {
    public static void main(String[] args) {

        Manager jane = new Manager("Jane");
        SalesPerson bob = new SalesPerson("Bob", jane);
        SalesPerson sue = new SalesPerson("Sue", jane);

        SalesTeam salesTeam = new SalesTeam();
        salesTeam.addPayee(jane);
        salesTeam.addPayee(bob);
        salesTeam.addPayee(sue);

        payPayee(jane, 100);
        payPayee(bob, 300);
        payPayee(salesTeam, 200);
    }

    private static void payPayee(Payee payee, int amount) {
        payee.payExpense(amount);
    }

}
