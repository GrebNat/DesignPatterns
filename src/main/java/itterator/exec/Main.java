package itterator.exec;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Employee sara = new Employee("Sara");
        Employee lara = new Employee("Lara");
        Employee vera = new Employee("Vera");

        StaffList staffList = new StaffList(sara, lara, vera);
        StaffListIterator staffListIterator = new StaffListIterator(staffList);

        while (staffListIterator.hasNext())
            System.out.println(staffListIterator.next());
    }
}
