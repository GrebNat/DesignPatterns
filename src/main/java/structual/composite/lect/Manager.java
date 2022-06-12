package structual.composite.lect;

public class Manager implements Payee{
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public void payExpense(int amount){
        System.out.println(name +" payed amount " + amount);
    }
}
