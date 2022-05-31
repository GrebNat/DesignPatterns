package visitor.exec;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class SailsPerson implements Employee{

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    private int salary = 5000;

}
