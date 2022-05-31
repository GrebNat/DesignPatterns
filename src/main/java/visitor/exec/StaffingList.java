package visitor.exec;

import java.util.ArrayList;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class StaffingList implements Employee{

    ArrayList<Employee> salaries = new ArrayList<>();

    public StaffingList() {
        Manager manager = new Manager();
        SailsPerson sailsPerson1 = new SailsPerson();
        SailsPerson sailsPerson2 = new SailsPerson();

        salaries.add(manager);
        salaries.add(sailsPerson1);
        salaries.add(sailsPerson2);
    }

    @Override
    public void accept(Visitor visitor) {
        salaries.forEach(x->x.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public int getSalary() {
        return salaries.stream().mapToInt(Employee::getSalary).sum();
    }
}
