package structural.composite;

public abstract class Department {

    private final String name;

    public Department(String name) {
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println("Department name: " + name);
    }
}
