package behaviour.command.visitor.exec;



/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class Manager implements Employee{

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary = 5000;

}
