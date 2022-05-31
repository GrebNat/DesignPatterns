package visitor.exec;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        StaffingList staffingList = new StaffingList();
        System.out.println(staffingList.getSalary());

        staffingList.accept(new IndexingSalaryVisitor());
        System.out.println(staffingList.getSalary());

    }
}
