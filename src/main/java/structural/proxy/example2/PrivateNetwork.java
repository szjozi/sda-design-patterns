package structural.proxy.example2;

public class PrivateNetwork implements CompanyNetwork {

    @Override
    public void getAccess(String username) {
        System.out.println("Private network access granted to user: " + username);
    }
}
