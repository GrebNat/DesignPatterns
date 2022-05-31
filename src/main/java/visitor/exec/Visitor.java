package visitor.exec;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public interface Visitor {
    void visit(Manager manager);
    void visit(SailsPerson sailsPerson);
    void visit(StaffingList staffingList);
}
