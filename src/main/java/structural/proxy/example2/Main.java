package structural.proxy.example2;

public class Main {

    public static void main(String[] args) {
        EmployeesRegistry employeesRegistry = new EmployeesRegistry();

        String employeeUser = "Employee user";
        String nonEmployeeUser = "Non employee user";

        employeesRegistry.addEmployee(employeeUser, new Employee("Jan", "Kowalski"));

        NetworkProxy networkProxy = new NetworkProxy(employeesRegistry);

        networkProxy.getAccess(employeeUser);
        networkProxy.getAccess(nonEmployeeUser);
    }
}
