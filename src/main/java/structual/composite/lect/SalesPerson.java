package structual.composite.lect;

public class SalesPerson implements Payee{
    String name;
    Manager manager;

    public SalesPerson(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public void payExpense(int amount){
        System.out.println(name +" payed amount " + amount);
    }
}
