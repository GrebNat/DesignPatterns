package itterator.exec;

import java.util.Iterator;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class StaffListIterator implements Iterator {
    StaffList staffList;
    int index;

    public StaffListIterator(StaffList staffList) {
        this.staffList = staffList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return staffList.getEmployees().length > index;
    }

    @Override
    public Employee next() {
        if (hasNext())
            return staffList.getEmployees()[index++];

        return null;
    }
}
