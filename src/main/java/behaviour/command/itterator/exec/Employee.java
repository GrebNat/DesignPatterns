package behaviour.command.itterator.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
