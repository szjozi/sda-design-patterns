package structural.proxy.example2;

import java.util.HashMap;
import java.util.Map;


public class EmployeesRegistry {

    private final Map<String, Employee> employees;

    public EmployeesRegistry() {
        employees = new HashMap<>();
    }

    public void addEmployee(String username, Employee employee) {
        employees.put(username, employee);
    }

    public boolean isEmployee(String username) {
        return employees.containsKey(username);
    }

}
