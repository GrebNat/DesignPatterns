package behaviour.command.visitor.exec;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class IndexingSalaryVisitor implements Visitor {
    @Override
    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary() * 2);
    }

    @Override
    public void visit(SailsPerson sailsPerson) {
        sailsPerson.setSalary(sailsPerson.getSalary() * 3);

    }

    @Override
    public void visit(StaffingList staffingList) {
        System.out.println("salary indexed");
    }
}
