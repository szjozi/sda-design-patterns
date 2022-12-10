package structural.proxy.example2;


public record NetworkProxy(EmployeesRegistry employeesRegistry) implements CompanyNetwork {

    @Override
    public void getAccess(String username) {

        final CompanyNetwork companyNetwork = employeesRegistry.isEmployee(username) ?
                new PrivateNetwork() : new PublicNetwork();

        companyNetwork.getAccess(username);
    }
}
