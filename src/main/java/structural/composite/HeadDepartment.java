package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment extends Department {

    private final List<Department> childDepartments;

    public HeadDepartment() {
        super("Head Department");
        this.childDepartments = new ArrayList<>();
    }

    public void listDepartments() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

}
