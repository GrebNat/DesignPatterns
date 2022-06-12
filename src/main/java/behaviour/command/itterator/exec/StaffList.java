package behaviour.command.itterator.exec;

import java.util.Iterator;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class StaffList implements Iterable{

    Employee[] employees;

    public StaffList(Employee... employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
