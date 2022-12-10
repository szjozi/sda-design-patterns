package structural.composite;

public class Main {

    public static void main(String[] args) {

        FinanceDepartment financeDepartment = new FinanceDepartment();
        financeDepartment.printDepartmentName();

        System.out.println("=========================");

        SalesDepartment salesDepartment = new SalesDepartment();
        salesDepartment.printDepartmentName();

        System.out.println("=========================");

        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.printDepartmentName();

        headDepartment.addDepartment(financeDepartment);
        headDepartment.addDepartment(salesDepartment);
        headDepartment.listDepartments();
        System.out.println("=========================");

        headDepartment.printDepartmentName();

        headDepartment.removeDepartment(salesDepartment);
        headDepartment.listDepartments();
        System.out.println("=========================");
    }
}
