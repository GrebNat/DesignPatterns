package behaviour.command.visitor.exec;



/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public interface Employee {
    int getSalary();

    void accept(Visitor visitor);
}
