package structural.proxy.example2;

public class PublicNetwork implements CompanyNetwork {

    @Override
    public void getAccess(String username) {
        System.out.println("Public network access granted to user: " + username);
    }
}
